package qa.test;

import org.testng.annotations.Test;


import base.BaseTest;
import pageEvents.ChooseMarketEvents;
import pageEvents.ExcludedishEvents;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import pageEvents.OpenMenuEvents;
import pageEvents.OpenNewDishesListEvents;
import pageEvents.SelectDishEvents;
import utils.ElementFetch;

public class Testcase1 extends BaseTest {
	
	ElementFetch ele=new ElementFetch();
	HomePageEvents homepage=new HomePageEvents();
	LoginPageEvents loginpage=new LoginPageEvents();
	OpenMenuEvents openmenu=new OpenMenuEvents();
	ChooseMarketEvents choosemarket=new ChooseMarketEvents();
	OpenNewDishesListEvents newdish=new OpenNewDishesListEvents();
	SelectDishEvents selectdish=new SelectDishEvents();
	ExcludedishEvents excludedish=new ExcludedishEvents();
  @Test
  public void Excludedishfromnewdishlist() throws InterruptedException {
	  logger.info("Sign in page appeared");
	  homepage.signInButton();
	  loginpage.verifyIfLoginPageISLoaded();
	  logger.info("Logged in succeesfully");
	  loginpage.enterCredentials();
	  loginpage.Login();
	  loginpage.verifyIfAppISLoaded();
	  Thread.sleep(2000);
	  choosemarket.choosemarket();
	  Thread.sleep(2000);
	  openmenu.openmenuclick();
	  newdish.opennewdishlist();
	  newdish.verifyIfNewDishListLoaded();
	  selectdish.selectdishfromlist();
	  Thread.sleep(1000);
	  excludedish.excludedish();
	  
  }
}

