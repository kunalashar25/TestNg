package com.learn.testng.methodDependency;

import org.testng.annotations.Test;

public class DependencyTest1
{
	@Test
	public void A()
	{
		System.out.println("This is A");
	}

	@Test(dependsOnMethods = "A")
	public void B()
	{
		System.out.println("This is B");
	}

	@Test()
	public void C()
	{
		System.out.println("This is C");
	}

	@Test
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
	// This is A
	// This is C
	// This is D
	// This is E
	// This is B
}
