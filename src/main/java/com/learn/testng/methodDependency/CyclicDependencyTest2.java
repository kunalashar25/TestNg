package com.learn.testng.methodDependency;

import org.testng.annotations.Test;

public class CyclicDependencyTest2 extends CyclicDependencyGroup
{

	@Test(groups="A1")
	public void method5()
	{
		System.out.println("This is method 5");
	}
	
	@Test(groups = "A2", dependsOnGroups="A1")
	public void method6()
	{
		System.out.println("This is method 6");
	}
	
	@Test(groups = "A3", dependsOnGroups="A2")
	public void method7()
	{
		System.out.println("This is method 7");
	}
	
	@Test(groups = "A4", dependsOnGroups="A3")
	public void method8()
	{
		System.out.println("This is method 8");
	}
}
