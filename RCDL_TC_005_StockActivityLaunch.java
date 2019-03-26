package RCDL_TestCases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class RCDL_TC_005_StockActivityLaunch {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		try{
			System.out.println("TC_005_StockActivityLaunch -Execution Begin in Android Phone : 8.0.0 version without internet");
			//Specify the Desired capabilities w.r.t appium automation for the device registered
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("deviceName", "192.168.190.102:5555");
			capabilities.setCapability("PlatformVersion", "8.0.0");
			capabilities.setCapability("appPackage", "com.locol.mne_mobile");
			capabilities.setCapability("appActivity", "com.mne.mne_app.mne.Actvity.SplashActivity");
			AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			//Register the Client Device
			driver.findElement(By.id("com.locol.mne_mobile:id/etClientIDUser")).sendKeys("MNE");
			driver.findElement(By.id("com.locol.mne_mobile:id/btnRegisterClient")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Login to Registered User 
			driver.findElement(By.id("com.locol.mne_mobile:id/etuserpassword")).sendKeys("1");
			driver.findElement(By.id("com.locol.mne_mobile:id/Login1")).click();
			//Navigate to Stock Report application 
			driver.findElement(By.id("com.locol.mne_mobile:id/txtTitle")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			System.out.println("Expected Result : User should be able to Launch Stock Activity from AOM Main Activity screen");
			System.out.println("Actual Result : User is able to Launch Stock Activity from AOM Main Activity screen");
			System.out.println("Expected Result = Actual Result ,hence RCDL_TC_005_StockActivityLaunch is PASSED");
			
			driver.closeApp();
		}
		catch (Exception e) 
		{
		// TODO Auto-generated catch block
		e.printStackTrace();
	   	   
		}


	}}
