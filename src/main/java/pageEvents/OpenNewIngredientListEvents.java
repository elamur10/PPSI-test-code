package pageEvents;

import org.testng.Assert;


import pageObjects.OpennewingredientListElements;
import utils.ElementFetch;

public class OpenNewIngredientListEvents {
	
ElementFetch ele=new ElementFetch();

	
	public void opennewinglist()
	{
		ele.getWebElement("XPATH", OpennewingredientListElements.newoption1).click();
		ele.getWebElement("XPATH", OpennewingredientListElements.ingredients).click();
		
	}
	
	public void verifyIfNewingListLoaded()
	{
		Assert.assertTrue(ele.getWebElements("XPATH", OpennewingredientListElements.newingredientlist).size()>0, "Element not found");
	  
	}

}
