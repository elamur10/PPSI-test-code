package pageEvents;

import pageObjects.PublishPPIElements;

import utils.ElementFetch;

public class PublishPPIEvents {

ElementFetch ele=new ElementFetch();
	 
	
	public void publishPPI()
	{
		ele.getWebElement("XPATH", PublishPPIElements.publish).click();
	
	}
     public void VerifyPPIISPublished()
	{
		String message=ele.getWebElement("XPATH", PublishPPIElements.verifymessage).getText();
		if(message.equalsIgnoreCase("The ingredient instruction is now published"));
		{
			System.out.println("PPI Published Successfully");
		}
		
	
	
	}
}
