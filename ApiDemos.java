/**
 * 
 */
package com.automationlearning;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApiDemos {

	AppiumDriver<MobileElement> driver;
	String path;
	
	public void setup()
	{
		System.out.println("Session is creating");
		path = System.getProperty("user.dir");
		System.out.println(path);
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability("deviceName", "192.168.190.107:5555");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", ".ApiDemos");
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Session is created");
	}
	
	public void validateText()
	{
		driver.findElementByAccessibilityId("Content").click();
		
		driver.findElementByAccessibilityId("Storage").click();
		driver.findElementByAccessibilityId("External Storage").click();
		driver.findElementByAccessibilityId("Create").click();
		String text = driver.findElementByAccessibilityId("Accessibility Node Provider").getText();
		System.out.println(text);
		System.out.println(text);
		if(text.equalsIgnoreCase("Accessibility Node Provider"))
		{
			System.out.println("Passed");
		} else
		{
			System.out.println("Failed");
		}
	}
	
	public void tearDown()
	{
		driver.quit();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApiDemos obj = new ApiDemos();
		obj.setup();
		obj.validateText();
		obj.tearDown();

	}
}
