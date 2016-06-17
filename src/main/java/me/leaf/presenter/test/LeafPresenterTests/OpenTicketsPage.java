package me.leaf.presenter.test.LeafPresenterTests;



import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

public class OpenTicketsPage {
	
	AppiumDriver driver;
	
	public OpenTicketsPage(AppiumDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public OpenTicketsPage waitUntilOpenTicketsDisplayed() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOf(driver.findElementByLinkText("NEW TICKET")));
		return this;
	}
	
	public NewTicketPage clickNewTicket() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOf(driver.findElementByLinkText("NEW TICKET"))).click();
		return new NewTicketPage(driver);
	}
}
