package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public abstract class PageBase
{
	protected static WebDriver driver;
	public PageBase( WebDriver driver)
	{
		PageBase.driver = driver;
	}
	protected WebElement find (By locator)
	{
	    return driver.findElement(locator);
    }
	protected void type (String text, By locator) 
	{
		find(locator).clear();
		find(locator).sendKeys(text);
	}
	protected void click (By locator)
	{
		find(locator).click();
	}
	protected Boolean isDisplayed (By locator)
	{
		try
		{
			System.out.println(locator.toString());
			return find(locator).isDisplayed();
		}
		catch (NoSuchElementException exc) 
		{
			return false;
		}
	}

}
