package pageEvents;



import pageObjects.CreateInstructionElements;
import utils.ElementFetch;

public class CreateInstructionEvents {

ElementFetch ele=new ElementFetch();
	
	public void createinstruction()
	{
		ele.getWebElement("XPATH", CreateInstructionElements.create).click();
	}
	
	
}

