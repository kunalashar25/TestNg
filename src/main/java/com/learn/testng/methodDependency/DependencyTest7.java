package com.learn.testng.methodDependency;

import org.testng.annotations.Test;

public class DependencyTest7
{
	@Test(dependsOnMethods = "D")
	public void A()
	{
		System.out.println("This is A");
	}

	@Test
	public void B()
	{
		System.out.println("This is B");
	}

	@Test
	public void C()
	{
		System.out.println("This is C");
	}

	@Test(dependsOnMethods = "B")
	public void D()
	{
		System.out.println("This is D");
	}

	@Test
	public void E()
	{
		System.out.println("This is E");
	}

	// Output:
	// This is B
	// This is C
	// This is E
	// This is D
	// This is A
}
