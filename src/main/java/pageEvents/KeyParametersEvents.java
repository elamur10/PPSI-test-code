package pageEvents;


import pageObjects.KeyParametersElements;
import utils.ElementFetch;

public class KeyParametersEvents {

ElementFetch ele=new ElementFetch();
	
	public void keyparameters()
	{
		ele.getWebElement("XPATH", KeyParametersElements.Keytab).click();
	}
	
	public void preparation()
	{
		ele.getWebElement("XPATH", KeyParametersElements.FirstStorageoption).click();
		ele.getWebElement("XPATH", KeyParametersElements.FirstStorage).click();
	}

}
