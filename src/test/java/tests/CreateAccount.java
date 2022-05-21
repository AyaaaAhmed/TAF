package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import data.LoadProperty;
import pages.MyAccount;

public class CreateAccount extends TestBase 
{
	String email = LoadProperty.userData.getProperty("email");
	String gender = LoadProperty.userData.getProperty("gender");
	String fN = LoadProperty.userData.getProperty("fName");
	String sN = LoadProperty.userData.getProperty("sName");
	String passwd = LoadProperty.userData.getProperty("password");
	String dayValue = LoadProperty.userData.getProperty("dayValue");
	String monthValue = LoadProperty.userData.getProperty("monthValue");
	String yearValue = LoadProperty.userData.getProperty("yearValue");
	String comp = LoadProperty.userData.getProperty("company");
	String fAdd = LoadProperty.userData.getProperty("fAdd");
	String sAdd = LoadProperty.userData.getProperty("sAdd");
	String state = LoadProperty.userData.getProperty("stat");
	String postCode = LoadProperty.userData.getProperty("postCode");
	String City = LoadProperty.userData.getProperty("City");
	String country = LoadProperty.userData.getProperty("country");
	String Phone = LoadProperty.userData.getProperty("Phone");
	String Mobile = LoadProperty.userData.getProperty("Mobile");
	String aliasAddress = LoadProperty.userData.getProperty("aliasAddress");
	
	 @Test
	  public void createUser() 
	  {
		 myAccount.regester(email);
		 myAccount.fillFields ( gender, fN,  sN, passwd,dayValue, monthValue, yearValue, comp, fAdd,
				 sAdd, state, postCode, City, country, Phone, Mobile, aliasAddress);
		 Logg();
	  }
	 @Test(dependsOnMethods = { "createUser" })
	 public void checkPage()
	 {
		 Assert.assertEquals(MyAccount.getDriverTitle(),"My account - My Store");
		 //("My account - My Store", );
	 }
}
