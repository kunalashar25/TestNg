package com.learn.testng.methodDependency;

import org.testng.annotations.BeforeGroups;

public class CyclicDependencyGroup
{
	@BeforeGroups(groups="A1")
	public void group1()
	{
		System.out.println("Group1");
	}
	
	@BeforeGroups(groups="A2")
	public void group2()
	{
		System.out.println("Group2");
	}
	
	@BeforeGroups(groups="A3")
	public void group3()
	{
		System.out.println("Group3");
	}
	
	@BeforeGroups(groups="A4")
	public void group4()
	{
		System.out.println("Group4");
	}
}
