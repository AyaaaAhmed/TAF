package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class MyAccount extends PageBase 
{
	private By emailAddressField = By.id("email_create");
	private By CreateAccountButton = By.id("SubmitCreate");
	private By genderMale = By.id("id_gender1");
	private By genderFemale = By.id("id_gender2");
	private By fNameField = By.id("customer_firstname");
	private By sNameField = By.id("customer_lastname");
	private By password = By.id("passwd");
	private By daysList = By.id("days");
	private By monthList = By.id("months");
	private By yearList = By.id("years");
	private By company = By.id("company");
	private By fAddress = By.id("address1");
	private By sAddress = By.id("address2");
	private By state = By.id("id_state");
	private By postcode = By.id("postcode");
	private By city = By.id("city");
	private By id_country = By.id("id_country");
	private By phone = By.id("phone");
	private By phoneMobile = By.id("phone_mobile");
	private By alias = By.id("alias");
	private By submitAccount = By.id("submitAccount");
	public MyAccount(WebDriver driver)
	{
		super(driver);	
	}
	public void setAccount (String userEmail)
	{
		 type(userEmail, emailAddressField);
	}
	public void regester (String userEmail) 
	{
		setAccount(userEmail);
		click(CreateAccountButton);
		enterUserInfo();
	}
	public void enterUserInfo()
	{
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOfElementLocated(submitAccount));
	
	}
	public void setGender (String gender)
	{
		if(gender == "M")
		{
			WebElement radioMale = driver.findElement(genderMale);
			radioMale.click();	
		}
		else
		{
			WebElement radioFamle = driver.findElement(genderFemale);
			radioFamle.click();
		}
	}
	public void setFname (String fName) 
	{
		type(fName, fNameField);
	}
	public void setSname (String sName) 
	{
		type(sName, sNameField);
	}
	public void setPasswd(String passwd)
	{
		type(passwd, password);
	}
	public void setCompany(String comp)
	{
		type(comp, company);
	}
	public void setfAddress(String fAdd)
	{
		type(fAdd, fAddress);
	}
	public void setsAddress(String sAdd)
	{
		type(sAdd, sAddress);
	}
	public void setState(String stat)
	{
		Select states = new Select(find(state));
		states.selectByVisibleText(stat);
	}
	public void setPostcode(String postCode)
	{
		type(postCode, postcode);
	}
	public void setCity(String City)
	{
		type(City, city);
	}
	public void setCountry(String country)
	{
		Select contires = new Select(find(id_country));
		contires.selectByVisibleText(country);
	}
	public void setPhone(String Phone)
	{
		type(Phone, phone);
	}
	public void setPhoneMobile(String Mobile)
	{
		type(Mobile, phoneMobile);
	}
	public void setAddAlias(String aliasAddress)
	{
		type(aliasAddress, alias);
	}
	public void selectFromList(String dayValue,String monthValue,String yearValue)
	{
		Select dayDropList = new Select(find(daysList));
		Select monthDropList = new Select(find(monthList));
		Select yearDropList = new Select(find(yearList));
		yearDropList.selectByValue(yearValue);
		dayDropList.selectByValue(dayValue);
		monthDropList.selectByValue(monthValue);
		
	}
	public void fillFields (String gender,String fname, String sname,String passwd,
			String dayValue,String monthValue,String yearValue,String comp,String fAdd,
			String sAdd,String stat,String postCode,String City,String country,String Phone
			,String Mobile,String aliasAddress)
	{
		setGender (gender);
		setFname(fname);
		setSname(sname);
		setPasswd(passwd);
		selectFromList(dayValue,monthValue,yearValue);
		setCompany(comp);
		setfAddress(fAdd);
		setsAddress(sAdd);
		setCity(City);
		setState(stat);
		setPostcode(postCode);
		setCountry(country);
		setPhone( Phone);
		setPhoneMobile(Mobile);
		setAddAlias(aliasAddress);
		clickLoginButton ();
	}
	public void clickLoginButton () 
	{
		 click(submitAccount);
	}
	public static String getDriverTitle()
	{
		String ActualTitle = driver.getTitle();
		return ActualTitle;
		
	}
	

	
	
	
	
	
	
	

}
