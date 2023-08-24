package pageEvents;

import pageObjects.SelectDishElements;
import utils.ElementFetch;

public class SelectDishEvents {
	
		ElementFetch ele=new ElementFetch();
		 
			
			public void selectdishfromlist()
			{
				ele.getWebElement("XPATH", SelectDishElements.selectdish).click();
			
			}

		

}
