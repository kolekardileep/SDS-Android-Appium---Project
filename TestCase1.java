package FarmRiseApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class TestCase1 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		long startTime = System.nanoTime();
		System.out.println("Test Started");
		
		try
		{
			DesiredCapabilities d=new DesiredCapabilities();
			    d.setCapability("platformName", "android");
			    d.setCapability("deviceName", "ZY3229LGWJ");
			    d.setCapability("platformVersion", "8.1.0");
  
			    URL u = new URL("http://127.0.0.1:4723/wd/hub");
			    d.setCapability("appPackage", "com.climate.farmrise");
			    d.setCapability("appActivity", "com.climate.farmrise.SplashScreen");
					
			    AndroidDriver driver=new AndroidDriver(u,d);
			
				Thread.sleep(4000);			
				List<WebElement> languages=driver.findElementsById("adapterLayout");
				System.out.println("Languages Count: "+languages.size());
				languages.get(1).click();
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
				Thread.sleep(4000);			
				driver.findElementById("checkWeatherDetails").click();
				Thread.sleep(4000);		
				driver.swipe(620, 928, 139, 932, 3000);
				Thread.sleep(4000);		
				driver.swipe(620, 928, 139, 932, 3000);
				Thread.sleep(4000);		
				driver.swipe(620, 928, 139, 932, 3000);	
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

}

