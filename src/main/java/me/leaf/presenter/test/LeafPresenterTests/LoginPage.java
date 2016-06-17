package me.leaf.presenter.test.LeafPresenterTests;

import io.appium.java_client.AppiumDriver;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
 AppiumDriver driver;
	
	public LoginPage(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage login(String userName, String password) throws InterruptedException{
		List<WebElement> textFieldsList = driver.findElementsByClassName("android.widget.EditText");
		textFieldsList.get(0).sendKeys(userName);
		textFieldsList.get(1).sendKeys(password);
		WebElement loginButton = driver.findElementByClassName("android.widget.Button");
		loginButton.click();
		return this;
	}
	
	public OpenTicketsPage enterPin(String pin){
		 char first=pin.charAt(0);//Gives You first digit
		 char second=pin.charAt(1);
		 char third=pin.charAt(2);
		 char fourth=pin.charAt(3);
		
		WebElement fd = driver.findElementByLinkText(Character.toString(first));
		fd.click();
		WebElement sd = driver.findElementByLinkText(Character.toString(second));
		sd.click();
		WebElement td = driver.findElementByLinkText(Character.toString(third));
		td.click();
		WebElement fod = driver.findElementByLinkText(Character.toString(fourth));
		fod.click();
		
		return new OpenTicketsPage(driver);
		
	}
	

}
