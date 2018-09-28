package com.learn.testng.testCases.regression;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class AnnotationTransform implements IAnnotationTransformer
{
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod)
	{		
		if(testMethod.getName().equalsIgnoreCase("testRegression2_2"))
		{
			annotation.setInvocationCount(5);;
		}
		
	}
}
