package com.learn.testng.codeTest;

import org.testng.annotations.Test;

public class PriorityWithDependsOnTest
{

	@Test
	public void A()
	{
		System.out.println("This is A");
	}

	@Test
	public void B()
	{
		System.out.println("This is B");
	}

	@Test(dependsOnMethods = "E", priority = 1)
	public void C()
	{
		System.out.println("This is C");
	}

	@Test()
	public void D()
	{
		System.out.println("This is D");
	}

	@Test
	public void E()
	{
		System.out.println("This is E");
	}

	@Test()
	public void F()
	{
		System.out.println("This is F");
	}

	// Note: with dependsOnMethods and priority in use, dependsOnMethods is given first preference.
}
