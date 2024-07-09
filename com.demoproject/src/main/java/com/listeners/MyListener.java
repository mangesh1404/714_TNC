package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

	public void onTestStart(ITestResult result) {// for each method/TC
		System.out.println("Testcase execution started "+ result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Testcase execution passed "+ result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Testcase execution failed "+ result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Testcase execution skipped "+ result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {	
	}

	public void onStart(ITestContext context) {
		System.out.println("Test suite started");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test suite finished");
	}

	
}
