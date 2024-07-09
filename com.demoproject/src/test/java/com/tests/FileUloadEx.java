package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUloadEx {

	@Test
	public void test01() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\AutoIT\\chromedriverAutoIT.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/playground/file-upload");
		driver.manage().window().maximize();

		driver.findElement(By.id("file")).click();

		Thread.sleep(2000);

		Runtime.getRuntime().exec("D:\\AutoIT\\FileUpload.exe");

	}

}
