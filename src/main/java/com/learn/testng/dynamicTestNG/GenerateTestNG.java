package com.learn.testng.dynamicTestNG;

import org.reflections.Reflections;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlInclude;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class GenerateTestNG {

	// Generating TestNG at runtime
	public static void main(String[] args) {

		// creating TestNG object
		TestNG testNG = new TestNG();

		// creating list of suites to add to the testNG
		List<XmlSuite> suiteList = new ArrayList<>();

		// creating new Suite
		XmlSuite suite = new XmlSuite();
		suite.setName("Runtime TestNG");
		suite.setThreadCount(5);
		suite.setParallel(XmlSuite.ParallelMode.METHODS);

		// creating list of tests to add to suite tag
		List<XmlTest> testList = new ArrayList<>();

		// creating new test
		XmlTest test = new XmlTest(suite);
		test.setName("Demo");

		// creating class List to add all the class that are set for execution
		List<XmlClass> classList = new ArrayList<XmlClass>();

		// to get all classes containing testcases
		Reflections reflections = getAllTestcaseClass();
		Set<Class<?>> allClasses = reflections.getSubTypesOf(Object.class);

		// Iterating on all classes
		for (Class c : allClasses) {

			// creating class
			XmlClass cls = new XmlClass(c);

			// to fetch all methods of a class
			Method[] allMethods = c.getDeclaredMethods();

			// created list to add all the methods from a class that has to be executed.
			List<XmlInclude> includeMethods = new ArrayList<>();

			// iterating on all methods and adding to the class
			for (Method method : allMethods) {

				/*
					Code to filter methods on runtime can be added here.
					You can fetch methods to be executed from an external file and can compare by methods name here.
					If matched then add it to the list. So we can control which method to run.

				 */

				// creating method list to add to each class
				includeMethods.add(new XmlInclude(method.getName()));
			}

			// if method list is not empty then do following
			if (!includeMethods.isEmpty()) {

				// adding all methods to the testNg configuration
				cls.setIncludedMethods(includeMethods);

				// adding class to the class list
				classList.add(cls);
			}
		}

		// adding all classed to test tag
		test.setXmlClasses(classList);

		// adding test to the list
		testList.add(test);

		// adding all tests to the suite
		suite.setTests(testList);

		// adding suite to the list
		suiteList.add(suite);

		System.out.println("Generated XML File:\n" + suite.toXml());

		// adding all suites to testNG
		testNG.setXmlSuites(suiteList);

		// initiate run
		testNG.run();
	}


	/**
	 * It'll scan all the classes placed at below path
	 *
	 * @return Reflection object
	 */
	private static Reflections getAllTestcaseClass() {
		String testcasePackagePath = "com.learn.testng.cases";

		final ConfigurationBuilder config = new ConfigurationBuilder()
				.setScanners(new ResourcesScanner(), new SubTypesScanner(false))
				.setUrls(ClasspathHelper.forPackage(testcasePackagePath))
				.filterInputsBy(new FilterBuilder().includePackage(testcasePackagePath));

		final Reflections reflect = new Reflections(config);

		return reflect;
	}
}
