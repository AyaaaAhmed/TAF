package tests;

import org.testng.annotations.Test;

public class NormalUserLogin extends TestBase 
{
	  @Test
	  public void testStandardUserCanLogin() 
	  {
		  loginPage.loginWith("ayaahmed199630@gmail.com", "123456");
	  }
}
