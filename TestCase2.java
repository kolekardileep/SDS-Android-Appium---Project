package FarmRiseApp;

import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.AndroidKeyMetastate;

public abstract class TestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long startTime = System.nanoTime();
		System.out.println("Test Started");
		
		try
		{
			DesiredCapabilities d=new DesiredCapabilities();
			
		    d.setCapability("platformName", "android");
		    d.setCapability("deviceName", "ZY3229LGWJ");
		    d.setCapability("platformVersion", "8.1.0");
			d.setCapability("appPackage", "com.climate.farmrise");
			d.setCapability("appActivity", "com.climate.farmrise.SplashScreen");
			
			URL u=new URL("http://0.0.0.0:4723/wd/hub");
			
			AndroidDriver driver=new AndroidDriver(u,d);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			List<WebElement> tryAgain=driver.findElementsById("btn_error_tryAgain");

			Thread.sleep(4000);
			List<WebElement> languages=driver.findElementsById("adapterLayout");
			System.out.println("Languages Count: "+languages.size());
			languages.get(0).click();
			
			Thread.sleep(4000);			
			driver.findElementById("btn_Proceed").click();
			
			Thread.sleep(4000);			
			driver.findElementById("btn_agree").click();
			
			Thread.sleep(4000);			
			driver.findElementById("tv_dismiss").click();
			Thread.sleep(4000);			
			driver.findElementById("tv_dismiss").click();
			Thread.sleep(4000);			
			driver.findElementById("tv_dismiss").click();
			Thread.sleep(4000);			
			driver.findElementById("tv_dismiss").click();
			Thread.sleep(4000);			
			driver.findElementById("tv_dismiss").click();
		
			Thread.sleep(2000);			
			scrollTo(driver, "View All Schemes");		//Government Schemes Update			
			Thread.sleep(4000);			
			driver.findElementByXPath("//android.widget.TextView[@text='View All Schemes']").click();
			Thread.sleep(4000);			
			driver.findElementById("search_button").click();
			Thread.sleep(4000);		
			driver.findElementById("search_src_text").sendKeys("Atal Pension Yojana");;
			Thread.sleep(4000);	
			driver.hideKeyboard();
			Thread.sleep(4000);	
			driver.pressKeyCode(67);
			Thread.sleep(2000);
			driver.pressKeyCode(66);
		}
		catch(Exception ex)
		{
			System.out.println("Error : "+ex);
		}
		finally {
			System.out.println("Test Finished");
			long endTime   = System.nanoTime();
			long totalTime = endTime - startTime;
			System.out.println("Elapsed time in seconds: " + totalTime / 1000000000);
		}
		
	}
	
	public static void scrollTo(AndroidDriver driver,String text)
	{                
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+text+"\").instance(0))");
	}

}

