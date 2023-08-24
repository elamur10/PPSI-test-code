package pageEvents;


import org.testng.Assert;


import pageObjects.OpenNewDishesListElements;
import utils.ElementFetch;

public class OpenNewDishesListEvents {
ElementFetch ele=new ElementFetch();

	
	public void opennewdishlist()
	{
		ele.getWebElement("XPATH", OpenNewDishesListElements.newoption).click();
		ele.getWebElement("XPATH", OpenNewDishesListElements.dishes).click();
		
	}
	
	public void verifyIfNewDishListLoaded()
	{
		Assert.assertTrue(ele.getWebElements("XPATH", OpenNewDishesListElements.newdishlist).size()>0, "Element not found");
	  
	}

}
