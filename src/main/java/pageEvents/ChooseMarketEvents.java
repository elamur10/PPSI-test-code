package pageEvents;



import pageObjects.ChooseMarketElements;

import utils.ElementFetch;

public class ChooseMarketEvents {

ElementFetch ele=new ElementFetch();
	
	public void choosemarket()
	{
		ele.getWebElement("XPATH", ChooseMarketElements.choosemarket).click();
		ele.getWebElement("XPATH", ChooseMarketElements.marketselection).click();

	}
}
