package qa.test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageEvents.ChooseMarketEvents;
import pageEvents.CreateInstructionEvents;
import pageEvents.HomePageEvents;
import pageEvents.KeyParametersEvents;
import pageEvents.LoginPageEvents;
import pageEvents.OpenMenuEvents;
import pageEvents.OpenNewIngredientListEvents;
import pageEvents.PublishPPIEvents;
import pageEvents.SavePPIEvents;
import utils.Constants;
import utils.ElementFetch;

public class TestCase2 extends BaseTest {
	

	ElementFetch ele=new ElementFetch();
	public ExtentReports extent;
	HomePageEvents homepage=new HomePageEvents();
	LoginPageEvents loginpage=new LoginPageEvents();
	OpenMenuEvents openmenu=new OpenMenuEvents();
	ChooseMarketEvents choosemarket=new ChooseMarketEvents();
	OpenNewIngredientListEvents opening=new OpenNewIngredientListEvents();
	CreateInstructionEvents createPPI=new CreateInstructionEvents();
	KeyParametersEvents keyparam=new KeyParametersEvents();
	SavePPIEvents save=new SavePPIEvents();
	PublishPPIEvents publish=new PublishPPIEvents();

	 
	
  @Test
  public void PublishPPI() throws InterruptedException {
	  
	
	  logger.info("Sign in page appeared");
	  homepage.signInButton();
	  loginpage.verifyIfLoginPageISLoaded();
	  loginpage.enterCredentials();
	  loginpage.Login();
	  loginpage.verifyIfAppISLoaded();
	  Thread.sleep(3000);
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
	 Thread.sleep(2000);
	 save.SavePPI();
	 //logger.info("PPI is saved");
	 Thread.sleep(2000);
	 publish.publishPPI();
	 Thread.sleep(2000);
	 publish.VerifyPPIISPublished();
	 //logger.info("PPI is published");
	 
  }





}

