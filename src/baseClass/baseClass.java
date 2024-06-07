package baseClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import io.appium.java_client.service.local.AppiumDriverLocalService;

public class baseClass {
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	@Test
	
	public void AppiumTest() throws MalformedURLException, InterruptedException
	{ 
//	UiAutomator2Options options = new UiAutomator2Options();
//		options.setApp("//Users//proffatai//Documents//Appium projects//Boomplay_Appium_Automation//src//resources//boomplay.apk");
//		options.setDeviceName("Pixel4"); 
		
		 //Alternative way of starting the app by setting all the app capabilites
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Pixel4");
        capabilities.setCapability("appPackage", "com.afmobi.boomplayer");
        capabilities.setCapability("appActivity", "com.tecno.boomplayer.guide.ControllerActivity");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("noReset", true);
        capabilities.setCapability("appWaitDuration", 10000); // 30 seconds
		capabilities.setCapability("app", "//Users//proffatai//Documents//Appium projects//Boomplay_Appium_Automation//src//resources//boomplay.apk");
		
	
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),capabilities);
		
		driver.findElement(AppiumBy.id("com.afmobi.boomplayer:id/bt_ok")).click(); 
		Thread.sleep(4000); 
		driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button")).click();
		Thread.sleep(4000); 
		driver.findElement(AppiumBy.id("com.afmobi.boomplayer:id/skip")).click(); 
		

		Thread.sleep(4000); 	
		driver.quit();
		
	}


}
 