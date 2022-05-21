package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import pages.MyAccount;
import pages.RegesterdUserAlreadyPage;
import utilities.Helper;

public class TestBase
{
	public WebDriver driver;
	private final String AUT_URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
	protected LoginPage loginPage;
	protected MyAccount myAccount;
	protected  RegesterdUserAlreadyPage regesterAcc;
	protected static Logger log = LogManager.getLogger();
	 @BeforeSuite
	public void setUp () 
	{
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(AUT_URL);
	    loginPage  = new LoginPage(driver);
	    myAccount = new MyAccount (driver);
	    regesterAcc = new RegesterdUserAlreadyPage(driver);
	  }
	  @AfterSuite
	  public void tearDown () 
	  {
		  driver.quit();
	  }
	  @AfterMethod
	  public void screenshotONFaluir(ITestResult result)
	  {
		  if(result.getStatus() == ITestResult.FAILURE)
		  {
			  System.out.println("Failed Testcase");
			  Helper.captureScreenshots(driver, result.getName());
		  }
	  }
	  public static void  Logg()
	  {
			log.error("The error");
			log.info("here is the info");
	  }
	  


}
