package RCDL_TestCases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class RCDL_TC_002_Launch_RCDLapp {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		try{
			System.out.println("TC_RCDL-001-Execution Begin in Android Phone : 8.0.0 version without internet");
			//Specify the Desired capabilities w.r.t appium automation for the device registered
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("deviceName", "192.168.190.102:5555");
			capabilities.setCapability("PlatformVersion", "8.0.0");
			capabilities.setCapability("appPackage", "com.locol.mne_mobile");
			capabilities.setCapability("appActivity", "com.mne.mne_app.mne.Actvity.SplashActivity");
			AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			System.out.println("Expected Result : User should be able to Launch the RCDL application successfully");
			System.out.println("Actual Result : User is able to Launch the RCDL application successfully");
			System.out.println("Expected Result = Actual Result ,hence RCDL_TC_002_Launch_RCDLapp has PASSED");
			driver.closeApp();
		}
		catch (Exception e) 
		{
		// TODO Auto-generated catch block
		e.printStackTrace();
	   	   
		}


	}}
