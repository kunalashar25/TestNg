package com.learn.testng.codeTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class Listener implements ITestListener, IAnnotationTransformer
{

	public void onTestStart(ITestResult result)
	{
		ITestNGMethod methodName = result.getMethod();
		String name = methodName.getMethodName();
		System.out.println(name);
	}

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod)
	{
	}

	public void onTestSuccess(ITestResult result)
	{
	}

	public void onTestFailure(ITestResult result)
	{
	}

	public void onTestSkipped(ITestResult result)
	{
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
	}

	public void onStart(ITestContext context)
	{
	}

	public void onFinish(ITestContext context)
	{
	}

}
