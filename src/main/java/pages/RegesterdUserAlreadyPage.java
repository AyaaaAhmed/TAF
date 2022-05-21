package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class RegesterdUserAlreadyPage extends PageBase 
{
	private static By emailAddressField = By.id("email_create");
	private By CreateAccountButton = By.id("SubmitCreate");
	private By create_account_error = By.id("create_account_error");
	public RegesterdUserAlreadyPage(WebDriver driver)
	{
		super(driver);	
	}
	public void setAccount (String userEmail)
	{
		 type(userEmail, emailAddressField);
	}
	public  void regesteredUserAlready(String userEmail) 
	{
		setAccount(userEmail);
		click(CreateAccountButton);
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(create_account_error));
	}
	//create_account_error
}
