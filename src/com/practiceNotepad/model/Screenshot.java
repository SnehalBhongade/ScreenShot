package com.practiceNotepad.model;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;


public class Screenshot{

public static void main(String args[]) throws IOException
{
	System.setProperty("webdriver.gecko.driver","D:\\Selenium Setup\\firefox\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com");

	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String time = new SimpleDateFormat("YYYY-MM-DD-HH-mm-ss").format(new Date());
	FileUtils.copyFile(src, new File("E:\\TestingProgram\\ScreenShot\\screenshot\\fb"+time+".jpeg")); 
}
}
