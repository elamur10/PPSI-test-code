package pageEvents;

import org.testng.Assert;


import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {
	ElementFetch ele= new ElementFetch();
	public void verifyIfLoginPageISLoaded()
	{
		Assert.assertTrue(ele.getWebElements("XPATH", LoginPageElements.SignIntext).size()>0, "Element not found");
	} 
	public void enterCredentials()
	{
		ele.getWebElement("XPATH", LoginPageElements.Email).sendKeys("testadminppsi@ifood.test");
		ele.getWebElement("XPATH", LoginPageElements.Pass).sendKeys("iFood1234!");
	}
	
	public void Login()
	{
		ele.getWebElement("XPATH", LoginPageElements.SignInButton).click();
	}
    
	public void verifyIfAppISLoaded()
	{
		Assert.assertTrue(ele.getWebElements("XPATH", LoginPageElements.apppage).size()>0, "Element not found");
		
	}
}
