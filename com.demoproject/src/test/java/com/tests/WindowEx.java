package com.tests;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class WindowEx {

	@Test
	public void test01() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/Downloads/Offline%20Website/pages/examples/dashboard.html");
		driver.manage().window().maximize();
		// 1 window
		String mainWin = driver.getWindowHandle();
		List<WebElement> links = driver.findElements(By.xpath("//a[text()='More info ']"));// 4 values
		
		for(WebElement link : links)
			link.click(); // 4 times-- browser 5 windows
		
		Set<String>allWindows = driver.getWindowHandles(); // 5 values
		
		for(String win : allWindows) {
			System.out.println("handle of a window: "+win);
			if(!win.equals(mainWin)) {
				driver.switchTo().window(win);//-- 4 times
				System.out.println(driver.getCurrentUrl());
				Thread.sleep(2000);
				driver.close();
			}
			
		}
		
	}
}
