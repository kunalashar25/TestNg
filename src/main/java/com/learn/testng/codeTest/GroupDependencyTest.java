package com.learn.testng.codeTest;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupDependencyTest
{

	@Test(priority = 1)
	public void A_G1()
	{
		System.out.println("Method A of G1");
	}

	@Test(priority = 1)
	public void B_G1()
	{
		System.out.println("Method B of G1");
	}

	@Test(groups = "G2", priority = 2, dependsOnGroups = "G1", alwaysRun = true)
	public void A_G2()
	{
		System.out.println("Method A of G2");
	}

	@Test(groups = "G2", priority = 2, dependsOnGroups = "G1", alwaysRun = true)
	public void B_G2()
	{
		System.out.println("Method B of G2");
	}

	@Test(groups = "G3", priority = 3, dependsOnGroups = "G2", alwaysRun = true)
	public void A_G3()
	{
		System.out.println("Method A of G3");
	}

	@Test(groups = "G3", priority = 3, dependsOnGroups = "G2", alwaysRun = true)
	public void B_G3()
	{
		System.out.println("Method B of G3");
	}

	@BeforeGroups(groups = "G1")
	public void beforeGroup1()
	{
		System.out.println("Before Group of g1");
	}

	@BeforeGroups(groups = "G2")
	public void beforeGroup2()
	{
		System.out.println("Before Group of g2");
	}

	@BeforeGroups(groups = "G3")
	public void beforeGroup3()
	{
		System.out.println("Before Group of g3");
	}
}
