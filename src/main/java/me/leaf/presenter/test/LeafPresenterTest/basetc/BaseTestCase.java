package me.leaf.presenter.test.LeafPresenterTest.basetc;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestCase {
	
	public AppiumDriver driver;
	
	
	@BeforeMethod
	public void setUp() throws Exception {
	
	//set up appium
	File app = new File("./path/to/apk.apk");
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("deviceName","LeafPresenter");
	capabilities.setCapability("platformVersion", "4.1");
	capabilities.setCapability("app", app.getAbsolutePath());
	capabilities.setCapability("appPackage", "com.LeafPresenter");
	capabilities.setCapability("appActivity", "com.leaf.presenter.app.activity.LoginAccountActivity");
	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}
	@AfterMethod
	public void tearDown() throws Exception {
	driver.quit();
	}

}
