package com.learn.testng.codeTest;

import org.testng.annotations.Test;

/**
 * @author kunal.ashar
 */

public class PriorityTest {

	@Test
	public void C() {
		System.out.println("This is C");
	}

	@Test (priority = 1)
	public void B() {
		System.out.println("This is B");
	}

	@Test
	public void D() {
		System.out.println("This is D");
	}

	@Test
	public void A() {
		System.out.println("This is A");
	}

	// Note: when priorities are assigned to only few cases then it assigns
	// priority as 0 to cases that doesn't have priority attribute and executed
	// them first in alphabetical order and then it executes cases with
	// priorities.

}
