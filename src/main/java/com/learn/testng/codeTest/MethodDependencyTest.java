package com.learn.testng.codeTest;

import org.testng.annotations.Test;

/**
 * 
 * @author kunal.ashar
 *
 */

public class MethodDependencyTest
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

	@Test(dependsOnMethods = "E")
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

	// Note: first it checks for dependsOnMethods, if it is present then
	// dependent method will be executed. In this case it'll be E, post that C
	// will be executed as C is dependent on E. Post this it'll follow
	// alphabetical order from C (as C has dependsOnMethods) - Z and then it'll
	// execute all pending methods in Z - A sequence.

}
