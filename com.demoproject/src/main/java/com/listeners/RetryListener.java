package com.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListener implements IRetryAnalyzer {

	int count =1;
	int limit=3;
	
	public boolean retry(ITestResult result) {
		
		if(count<limit) {
			count++;// 2, 3
			return true;
		}
		return false;
	}

}
