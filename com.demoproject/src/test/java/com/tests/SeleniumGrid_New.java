package com.tests;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumGrid_New {

	RemoteWebDriver driver=null;
	String url = "http://localhost:4444/wd/hub";
	@Parameters("port")
	@BeforeTest
	public void setup(String port)throws Exception {
		if(port.equals("4455")) {
			ChromeOptions option = new ChromeOptions();
			option.setCapability("browser", "Chrome");
			option.setCapability("platform", "windows");
			driver = new RemoteWebDriver(new URL(url), option);
		}
		if(port.equals("4457")) {
			FirefoxOptions option = new FirefoxOptions();
			option.setCapability("browser", "Firefox");
			option.setCapability("platform", "windows");
			driver = new RemoteWebDriver(new URL(url), option);
		}
		driver.get("file:///C:/Users/LENOVO/Downloads/Offline%20Website/index.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void loginTest() {
		
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
		
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
}
