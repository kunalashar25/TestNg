package com.learn.testng.methodDependency;

import org.testng.annotations.Test;

public class CyclicDependencyTest1 extends CyclicDependencyGroup
{

	@Test(groups="A1")
	public void method1()
	{
		System.out.println("This is method 1");
	}
	
	@Test(groups = "A2", dependsOnGroups="A3")
	public void method2()
	{
		System.out.println("This is method 2");
	}
	
	@Test(groups = "A3", dependsOnGroups="A2")
	public void method3()
	{
		System.out.println("This is method 3");
	}
	
	@Test(groups = "A4", dependsOnGroups="A3")
	public void method4()
	{
		System.out.println("This is method 4");
	}
}
