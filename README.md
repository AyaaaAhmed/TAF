# TAF
My first selenuim testing framework using
  1-pom design patters as page objects
    *RegesterdUserAlreadyPage
    *MyAccount
    *LoginPage
    and all pages extend from the basepage 
 2-properity file to read data from a file instead of hard coding the data into the script
 3-logg file to able to log test results
 4-TestBase to set all driver settings and to be extended from all tests like 
    *CreateAccount 
    *RegestedEmailAlready
  4-selenium.TakesScreenshot to be able to take screenshot on failures
  5-maven project to support dependencies
