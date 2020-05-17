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
		System.out.println("@BeforeTest");
	}

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("@BeforeClass");
	}

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("++++++++++ \n@BeforeMethod");
	}

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("@BeforeSuite");
	}

	@BeforeGroups("Group1")
	public void beforeGroup()
	{
		System.out.println("@BeforeGroup Group1");
	}

	@Test
	public void test1()
	{
		System.out.println("@Test test1");
	}

	@Test(groups = "Group1")
	public void test2()
	{
		System.out.println("@Test test2");
	}

	@AfterClass
	public void afterClass()
	{
		System.out.println("@AfterClass");
	}

	@AfterMethod
	public void afterMethod()
	{
		System.out.println("@AfterMethod\n----------");
	}

	@AfterSuite
	public void afterSuite()
	{
		System.out.println("@AfterSuite");
	}

	@AfterTest
	public void afterTest()
	{
		System.out.println("@AfterTest");
	}

	@AfterGroups("Group1")
	public void afterGroup()
	{
		System.out.println("@AfterGroup Group1");
	}

}
