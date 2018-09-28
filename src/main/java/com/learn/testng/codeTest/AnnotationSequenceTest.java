package com.learn.testng.codeTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * 
 * @author kunal.ashar
 *
 */

public class AnnotationSequenceTest
{

	@BeforeTest
	public void beforeTest()
	{
		System.out.println("This is before test");
	}

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("This is before class");
	}

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("********************* \nThis is before method");
	}

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("This is before suite");
	}

	@BeforeGroups("Group1")
	public void beforeGroup()
	{
		System.out.println("This is before group");
	}

	@Test
	public void test1()
	{
		System.out.println("This is test1");
	}

	@Test
	public void test2()
	{
		System.out.println("This is test2");
	}

	@Test(groups = "Group1")
	public void test3()
	{
		System.out.println("This is test3");
	}

	@AfterClass
	public void afterClass()
	{
		System.out.println("This is after class");
	}

	@AfterMethod
	public void afterMethod()
	{
		System.out.println("This is after method\n *********************");
	}

	@AfterSuite
	public void afterSuite()
	{
		System.out.println("This is after suite");
	}

	@AfterTest
	public void afterTest()
	{
		System.out.println("This is after test");
	}

	@AfterGroups("Group1")
	public void afterGroup()
	{
		System.out.println("This is after group");
	}

}
