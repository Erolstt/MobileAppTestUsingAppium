package me.leaf.presenter.test.LeafPresenterTests;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class HomePage {
	
	AppiumDriver driver;
	
	public HomePage(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
