package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FrameEx {

	@Test
	public void test01() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("account_dd")).click();
		
		driver.findElement(By.id("user_sign_in_sign_up")).click();// login click
		
		// frame opened
		WebElement element = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(element);
		
		driver.switchTo().parentFrame();// to switch on main content
		
		driver.findElement(By.id("mobileNoInp")).sendKeys("1234567890");
		
	}
}
