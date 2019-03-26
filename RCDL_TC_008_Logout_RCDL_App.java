package RCDL_TestCases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class RCDL_TC_008_Logout_RCDL_App {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		try{
			System.out.println("RCDL_TC_008_Logout_RCDL_App - Execution Begin in Android Phone : 8.0.0 version without internet");

			//AppiumDriver driver;
			DesiredCapabilities capabilities = new DesiredCapabilities();
			//SAMSUNG KITKAT VERSION
	
			//LENOVO DEVICE
			capabilities.setCapability("deviceName", "192.168.190.102:5555");

			capabilities.setCapability("PlatformVersion", "8.0.0");
			//capabilities.setCapability("app", System.getProperty("user.dir")+"/apk/ArmsWeather.apk");
		
			capabilities.setCapability("appPackage", "com.locol.mne_mobile");
			capabilities.setCapability("appActivity", "com.mne.mne_app.mne.Actvity.SplashActivity");
			/*capabilities.setCapability("appActivity", ".Register_Page");	
				capabilities.setCapability("appActivity", ".MainActivity_Login");*/
			//System.setProperty("webdriver.gecko.driver","D:\\IMPORTANT SkOFTWARES\\SELENIUM SW\\geckodriver.exe");
			AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			//AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:9515/wd/hub"), capabilities);

			//Register the Client Device
			driver.findElement(By.id("com.locol.mne_mobile:id/etClientIDUser")).sendKeys("MNE");
			driver.findElement(By.id("com.locol.mne_mobile:id/btnRegisterClient")).click();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			
			//Login to Registered User 
			driver.findElement(By.id("com.locol.mne_mobile:id/etuserpassword")).sendKeys("1");
			driver.findElement(By.id("com.locol.mne_mobile:id/Login1")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			//Logout from the application 
			System.out.println("Expected Result : User should be able to Logout/Exit from the AOM-RCDL applicaion' ");
			driver.findElement(By.id("com.locol.mne_mobile:id/tvLogout")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.id("android:id/button1")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.closeApp();
			System.out.println("Actual Result : User is able to Logout/Exit from the AOM-RCDL applicaion'");
			System.out.println("Expected Result = Actual Result ,hence RCDL_TC_008_Logout_RCDL_App is PASSED");
  	   		 
		}
		catch (Exception e) 
		{
		// TODO Auto-generated catch block
		e.printStackTrace();
	   	   
		}

	}

}
