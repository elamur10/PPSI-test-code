package pageEvents;





import pageObjects.ExcludedishElements;
import utils.ElementFetch;

public class ExcludedishEvents {
ElementFetch ele=new ElementFetch();
	
	public void excludedish()
	{   
		//String id=ele.getWebElement("XPATH", ExcludedishElements.ifoodid).getText();
		//Reporter.log(id);
		ele.getWebElement("XPATH", ExcludedishElements.option).click();
		ele.getWebElement("XPATH", ExcludedishElements.exclude).click();
		
	}

}
