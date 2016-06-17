package me.leaf.presenter.test.LeafPresenterTests;

import me.leaf.presenter.test.LeafPresenterTest.basetc.BaseTestCase;

import org.testng.annotations.Test;



/**
 * Smoke test for leaf presenter.
 */
public class SmokeTests extends BaseTestCase {


	@Test(enabled = false)
	public void loginTest() throws InterruptedException{
		LoginPage page = new LoginPage(driver);
					page.login("leaftest", "vngrs")
						.enterPin("1234")
						.waitUntilOpenTicketsDisplayed();
					
				
	}
	
	@Test
	public void buyOneItemPaidByCashTest() throws InterruptedException{
		LoginPage page = new LoginPage(driver);
					page.login("leaftest", "vngrs")
						.enterPin("1234")
						.clickNewTicket();
					
		
	}


}
