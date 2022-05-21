package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase
{
	private By userNameField = By.id("email");
	private By passwordField = By.id("passwd");
	private By loginButton = By.id("SubmitLogin");
	public LoginPage (WebDriver driver)
	{
		 super(driver);
	}
	public void setUsername (String username)
	{
		 type(username, userNameField);
	}
	public void setPassword (String password) 
	{
		type(password, passwordField);
	}
	public void clickLoginButton ()
	{
		 click(loginButton);
		 //return new MyAccount(driver);
	}
	public void loginWith (String username, String password)
	{
		setUsername(username);
		setPassword(password);
		clickLoginButton();
	}
}
