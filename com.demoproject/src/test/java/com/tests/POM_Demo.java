package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;

public class POM_Demo {
	
	WebDriver driver=null;
	LoginPage lp=null;
	DashboardPage dp =null;
	
	@BeforeSuite()
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver126.exe");
		driver= new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/Downloads/Offline%20Website/index.html");
		driver.manage().window().maximize();
		lp= new LoginPage(driver);
		dp = new DashboardPage();
	}

	@Test
	public void loginTest() {
		lp.loginToApplication();
		
	}
	
	@Test
	public void dashTest() {
		//dp.
	}
}
