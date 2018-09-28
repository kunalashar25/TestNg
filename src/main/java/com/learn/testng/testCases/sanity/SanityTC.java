package com.learn.testng.testCases.sanity;

import java.util.concurrent.atomic.AtomicInteger;

import org.testng.annotations.Test;

public class SanityTC
{
	
	AtomicInteger i = new AtomicInteger(0);
	
	@Test(groups="C",priority=4, invocationCount=5)
	public void testSanity1()
	{
		int count = i.addAndGet(1);
		System.out.println("Sanity testCase 1 "+count);
	}
	
	@Test(groups="C",priority=4, invocationCount=8)
	public void testSanity2()
	{
		int count = i.addAndGet(1);
		System.out.println("Sanity testCase 2 "+count);
	}
}
