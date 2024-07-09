package com.tests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class DemoTest2 {

	@Test
	public void login() {
		System.out.println("login");
	}
	@Test
	public void dash() {
		System.out.println("dash");
		Assert.assertTrue(false);
	}
	@Test
	public void logout() {
		System.out.println("dash1");
		throw new SkipException("Skipping a test case");
		
	}
	
}
