package me.leaf.presenter.test.LeafPresenterTests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class NewTicketPage {
	
	AppiumDriver driver;
	
	public NewTicketPage(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public HomePage clickDone() throws InterruptedException{
		WebElement done = driver.findElementByLinkText("DONE");
		done.click();
		return new HomePage(driver);
	}

}
