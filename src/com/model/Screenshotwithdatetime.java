package com.model;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.model1.s1;

public class Screenshotwithdatetime extends s1{
	
	
	public void m1(String filename, String extension) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String timestamp = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());
		
		FileUtils.copyFile(src, new File("E:\\TestingProgram\\ScreenShot\\screenshot\\"+filename+timestamp+extension));
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.out.println("main method");
		System.out.println("Opening firefox browser");
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Setup\\firefox\\geckodriver.exe");
		 s1.driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		
		Screenshotwithdatetime screen = new Screenshotwithdatetime();
		screen.m1("login1", ".jpeg");
		
		driver.findElement(By.cssSelector("a[href*='https://www.facebook.com/recover/initiate?lwv=110&ars=royal_blue_bar']")).click();
		Thread.sleep(3000);
		
		Screenshotwithdatetime screen1 = new Screenshotwithdatetime();
		screen1.m1("login2", ".jpeg");
	}
}
