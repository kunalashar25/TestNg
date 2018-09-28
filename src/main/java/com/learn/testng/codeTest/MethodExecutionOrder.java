package com.learn.testng.codeTest;

import org.testng.annotations.Test;

/**
 * 
 * @author kunal.ashar
 *
 */

public class MethodExecutionOrder
{

	@Test
	public void a()
	{
		System.out.println("This is a");
	}

	@Test
	public void C()
	{
		System.out.println("This is C");
	}

	@Test
	public void B()
	{
		System.out.println("This is B");
	}

	@Test
	public void A()
	{
		System.out.println("This is A");
	}

	@Test
	public void D()
	{
		System.out.println("This is D");
	}

	// Note: Big Alphabets will be executed first and then small ones.

}
