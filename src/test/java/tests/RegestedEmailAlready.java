package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import data.LoadProperty;
import pages.MyAccount;

public class RegestedEmailAlready extends TestBase 
{
	 String email = LoadProperty.userData.getProperty("email");
	 @Test
	  public void createUserWithRegesterdMail() 
	  {
		 regesterAcc.regesteredUserAlready(email);
		 Assert.assertEquals("Login - My Store", MyAccount.getDriverTitle());
		 Logg();
	  }
}
