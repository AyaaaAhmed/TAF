# TAF
My selenuim testing framework using
-----------------------------------
  1-pom design patters as page objects<br />
  
    *RegesterdUserAlreadyPage
    *MyAccount-
    *LoginPage-
    and all pages extend from the basepage 
 2-properity file to read data from a file instead of hard coding the data into the script
 <br />
 3-logg file to able to log test results
 <br />
 4-TestBase to set all driver settings and to be extended from all tests like 
 
    *CreateAccount 
    *RegestedEmailAlread
  4-selenium.TakesScreenshot to be able to take screenshot on failures
  <br />
  5-maven project to support dependencies
  <br />
  6-testng annoations
  
