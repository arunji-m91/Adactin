package com.baseclass;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.Alert;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * 
 * @author ARUN M
 * @Description Maintains All Reusable Methods
 * @Date 16-10-2022
 */
public class BaseClass {

	public static WebDriver driver;
	/**
	 * @author ARUN M
	 * @param element
	 * @param text
	 * @Date 16/12/2022
	 */
	
	public static void selByVisibleText(WebElement element,String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	

	/**
	 * @Description Close Window
	 * @Date 16-10-2022
	 */

	public void quitWindow() {
		driver.quit();
	}

	/**
	 * @Description Implicit Wait for 30 SEC
	 * @Date 16-10-2022
	 */
	public static void impliWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
	}

	/**
	 * @Description Maximize The Window
	 * @Date 16-10-2022
	 */

	public static void maximize() {

		driver.manage().window().maximize();
	}

	/**
	 * @Description Get AttributeValue From The WebElement
	 * @Date 16-10-2022
	 * @param element
	 * @return
	 */
	public static String getAttriValue(WebElement element) {
		String text = element.getAttribute("value");
		return text;
	}

	/**
	 * @Description Get The Path Of Current Working Directory
	 * @Date 16-10-2022
	 * @return
	 */

	public static String getProjectPath() {
		String path = System.getProperty("user.dir");
		return path;
	}

	/**
	 * @Description Get URL
	 * @Date 16-10-2022
	 * @param url
	 */
	public static void giveUrl(String url) {
		driver.get(url);
	}

	/**
	 * @Description Get Value From The Property File
	 * @Date 16-10-2022
	 * @param key
	 * @return Key Value As String
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
		String projectPath = getProjectPath();
		Properties properties = new Properties();
		properties.load(new FileInputStream(projectPath + "//Config//Config.properties"));
		Object object = properties.get(key);
		String value = (String) object;
		return value;
	}

	/**
	 * @Description Choosing The Browser
	 * @Date 16-10-2022
	 * @param browserType
	 */
	public static void getDriver(String browserType) {

		switch (browserType) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firfox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "ie":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			break;

		}

	}

//	public void explicitWaitForElement(WebElement element) {
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));
//		wait.until(ExpectedConditions.visibilityOf(element));
//		
//	}

	/**
	 * Description Taking Screenshot
	 * @Date 16-10-2022
	 * @return
	 */
	public static byte[] screenshot() {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		byte[] screenshotAs = screenshot.getScreenshotAs(OutputType.BYTES);
		return screenshotAs;

	}

	/**
	 * Description Send Value To TextBox
	 * @Date 16-10-2022
	 * @param element
	 * @param text
	 */

	public static void sendTo(WebElement element, String text) {
		element.sendKeys(text);
	}

	/**
	 * Description Accept The Alert
	 * @Date 16-10-2022
	 */
	public static void alertOk() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

}