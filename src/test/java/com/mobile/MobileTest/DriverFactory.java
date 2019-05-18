package com.mobile.MobileTest;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class DriverFactory
{
	public static AppiumDriver<WebElement> driver;
	public static DesiredCapabilities cap;
	
	public static void Android_LaunchApp() throws MalformedURLException {
		
		cap = new DesiredCapabilities();
		cap.setCapability("platformName","Android");
		cap.setCapability("deviceName","Nexus 5X API 28");
		cap.setCapability("autoGrantPermissions",true);
		cap.setCapability("app","E:\\apk\\Copy of TrianguloApp.apk");
		cap.setCapability("appPackage","com.eliasnogueira.trianguloapp");
		cap.setCapability("appActivity","com.eliasnogueira.trianguloapp.MainActivity");
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		Assert.assertNotNull(driver);
		//MobileDriver.setWebDriver(driver);
	}
	
	public static void iOS_LaunchApp() throws MalformedURLException {
		cap = new DesiredCapabilities();
		cap.setCapability("platformName", "iOS");
		cap.setCapability("deviceName", "iPhone 8 Plus");
		cap.setCapability("platformVersion", "11.3");
		cap.setCapability("bundleId", "");
		driver = new IOSDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		Assert.assertNotNull(driver);
		//MobileDriver.setWebDriver(driver);
	}
	
	public static void CloseApp() {
		driver.quit();
	}
}
