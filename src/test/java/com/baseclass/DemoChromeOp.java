package com.baseclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class DemoChromeOp extends BaseClass {
	public static void main(String[] args) throws IOException {
		
		getDriver("chrome");
		giveUrl("https://www.facebook.com/");
		sendTo(driver.findElement(By.id("email")),"arunji.m91@gmail.com");
		sendTo(driver.findElement(By.name("pass")),"arunchandra");
		driver.findElement(By.name("login")).click();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
//		byte[] screenshot = screenshot();
		File file = new File("E:\\img.png");
		FileUtils.copyFile(screenshotAs, file);
//		impliWait();
		
	}

}
