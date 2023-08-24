package pageEvents;

import pageObjects.OpenMenuElements;
import utils.ElementFetch;

public class OpenMenuEvents {
ElementFetch ele=new ElementFetch();
	
	public void openmenuclick()
	{
		ele.getWebElement("XPATH", OpenMenuElements.openmenu).click();
	}

}
