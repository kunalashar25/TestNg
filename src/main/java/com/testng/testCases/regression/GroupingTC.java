package com.testng.testCases.regression;

import org.testng.annotations.BeforeGroups;

public class GroupingTC
{

	@BeforeGroups(groups="A")
	public void beforeGroup1()
	{
		System.out.println("This is before group 1");
	}
	
	@BeforeGroups(groups="B", dependsOnGroups="A",alwaysRun=true)
	public void beforeGroup2()
	{
		System.out.println("This is before group 2");
	}
	
	@BeforeGroups(groups="C",dependsOnGroups="B",alwaysRun=true)
	public void beforeGroup3()
	{
		System.out.println("This is before group 3");
	}

}
