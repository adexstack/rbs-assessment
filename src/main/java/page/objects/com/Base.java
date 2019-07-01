package page.objects.com;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	
	public static AndroidDriver<AndroidElement> driver; // creating driver object only once for all testcases
	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		
	File f = new File("src");
	File fs = new File(f, "\\app\\OI-Shopping-List.apk");
		
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus6P");
	//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S9+");
	cap.setCapability(MobileCapabilityType.VERSION, "9.0");
	
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "org.openintents.shopping");
	cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "org.openintents.shopping.ShoppingActivity");
	cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
	
	AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	return driver;	
	}

}
