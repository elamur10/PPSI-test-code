package qa.test;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import base.BaseTest;
import pageEvents.ChooseMarketEvents;
import pageEvents.CreateInstructionEvents;
import pageEvents.ExcludedishEvents;
import pageEvents.HomePageEvents;
import pageEvents.KeyParametersEvents;
import pageEvents.LoginPageEvents;
import pageEvents.OpenMenuEvents;
import pageEvents.OpenNewDishesListEvents;
import pageEvents.OpenNewIngredientListEvents;
import pageEvents.PublishPPIEvents;
import pageEvents.SavePPIEvents;
import pageEvents.SelectDishEvents;
import utils.ElementFetch;


public class TestCases extends BaseTest {
	
	ElementFetch ele=new ElementFetch();
	HomePageEvents homepage=new HomePageEvents();
	LoginPageEvents loginpage=new LoginPageEvents();
	OpenMenuEvents openmenu=new OpenMenuEvents();
	ChooseMarketEvents choosemarket=new ChooseMarketEvents();
	OpenNewDishesListEvents newdish=new OpenNewDishesListEvents();
	SelectDishEvents selectdish=new SelectDishEvents();
	ExcludedishEvents excludedish=new ExcludedishEvents();
	public ExtentReports extent;
	OpenNewIngredientListEvents opening=new OpenNewIngredientListEvents();
	CreateInstructionEvents createPPI=new CreateInstructionEvents();
	KeyParametersEvents keyparam=new KeyParametersEvents();
	SavePPIEvents save=new SavePPIEvents();
	PublishPPIEvents publish=new PublishPPIEvents();
	
@Test(priority=1)
	  public void PublishPPI() throws InterruptedException {
		  
		
		  logger.info("Sign in page appeared");
		  homepage.signInButton();
		  loginpage.verifyIfLoginPageISLoaded();
		  loginpage.enterCredentials();
		  loginpage.Login();
		  loginpage.verifyIfAppISLoaded();
		  Thread.sleep(2000);
		  logger.info("Logged in succeesfully");
		  choosemarket.choosemarket();
		  Thread.sleep(2000);
		  logger.info("Market is selected from the list");
		  openmenu.openmenuclick();
		  opening.opennewinglist();
		  logger.info("New ingredients list is opened");
		  opening.verifyIfNewingListLoaded();
		  createPPI.createinstruction();
		  Thread.sleep(2000);
		  keyparam.keyparameters();
		  keyparam.preparation();
		  logger.info("Mandatory fields are entered");
		  Thread.sleep(1000);
		  save.SavePPI();
		  logger.info("PPI is saved");
		  publish.publishPPI();
		  logger.info("PPI is published");

	}

  @Test(priority=2)
  public void Excludedishfromnewdishlist() throws InterruptedException {
	  logger.info("Sign in page appeared");
	  homepage.signInButton();
	  loginpage.verifyIfLoginPageISLoaded();
	  loginpage.enterCredentials();
	  loginpage.Login();
	  loginpage.verifyIfAppISLoaded();
	  Thread.sleep(2000);
	  logger.info("Logged in succeesfully");
	  choosemarket.choosemarket();
	  Thread.sleep(2000);
	  logger.info("Market is selected from the list");
	  openmenu.openmenuclick();
	  newdish.opennewdishlist();
	  logger.info("New Dishes list is opened");
	  newdish.verifyIfNewDishListLoaded();
	  selectdish.selectdishfromlist();
	  Thread.sleep(1000);
	  logger.info("Dish is selected from the list");
	  excludedish.excludedish();
	  logger.info("Selected dish is excluded");
	  
  }
  
}
