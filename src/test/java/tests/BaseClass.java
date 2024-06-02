package tests;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;

public class BaseClass 
{
AndroidDriver driver;
    @BeforeTest
	public void setup() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		// It will hold desired capabilities, capabilities.setCapability(CapabilityType.Platform_Name,"Android");
		capabilities.setCapability("deviceName","samsung SM-M215F");
		capabilities.setCapability("udid","RZ8N3OWGQPR");
		capabilities.setCapability("platformname","Android");
		capabilities.setCapability("automationName","uiautomator2");
		capabilities.setCapability("platformversion","12");
		
		/* The no of secs the appium server should wait for clients
		 * To send commands before deciding
		 * client has gone and session
		 * should shut down*/
		capabilities.setCapability("appium:newCommandTimeout",60);
		
		// capabilities.setCapability("app","completePathOfApkFile");
		capabilities.setCapability("browserName","Chrome");
		capabilities.setCapability("chromedriverExecutable","search-ms:displayname=Search%20Results%20in%20Downloads&crumb=location:C%3A%5CUsers%5CADMIN%5CDownloads\\chromedriver_win32");
	
		// create device capability then create url and instantiate it
		
		URL url = URI.create("http://127.0.0.1:4723/").toURL();
		driver = new AndroidDriver(url, capabilities);
	}
    @AfterTest
	public void teardown() 
	{
	driver.close();
	driver.quit();
	}
	
}
