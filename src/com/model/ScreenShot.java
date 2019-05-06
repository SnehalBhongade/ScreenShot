package com.model;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","D:\\Selenium Setup\\firefox\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		
		Thread.sleep(3000);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		FileUtils.copyFile(src, new File("E:\\TestingProgram\\ScreenShot\\screenshot\\login.jpeg"));
	}
}