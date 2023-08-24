package pageEvents;

import pageObjects.SavePPIElements;
import utils.ElementFetch;

public class SavePPIEvents {
	ElementFetch ele=new ElementFetch();
	 
	
	public void SavePPI()
	{
		ele.getWebElement("XPATH", SavePPIElements.save).click();
	
	}

}
