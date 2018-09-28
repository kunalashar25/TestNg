package com.learn.testng.testCases.regression;

import org.testng.annotations.Test;

public class RegressionTC1 extends GroupingTC
{
	@Test(groups="A",priority=0)
	public void testRegression1_1()
	{
		System.out.println("Regression TC1_1");
	}
	
	@Test(groups="A",priority=1)
	public void testRegression1_2()
	{
		System.out.println("Regression TC1_2");		
	}
}
