package testcases;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pages.HomePage;
import pages.LoginPage;



public class TC2Login extends BaseClass {

	
	
	@Test(priority=2)
	public void verifyLogin() {
		test.log(LogStatus.INFO, "Login test started");
		app_logs.info("Login test started");
		HomePage hp = new HomePage(driver);
		test.log(LogStatus.INFO, "My Account Button Clicked");
		hp.doClickMyAccount();
		test.log(LogStatus.INFO, "Login Button Clicked");
		hp.doClickLogin();
		LoginPage lp=new LoginPage(driver);
		test.log(LogStatus.INFO, "Username and passwerd Entered");
		lp.doLogin("Jasveer23@gmail.com","hello@123");
		
		String actual = driver.getTitle();
		String expected="My Account";
		Assert.assertEquals(actual, expected);
		app_logs.info("Login test completed");
		test.log(LogStatus.INFO, "Login test completed");
					
	}
	
	@Test(priority=1)
	public void verifyInvalidLogin() throws InterruptedException {
	
	
		HomePage hp = new HomePage(driver);
		
		hp.doClickMyAccount();
		
		hp.doClickLogin();
		
		LoginPage lp=new LoginPage(driver);
		
		lp.invalidLogin("J23@gmail.com","helo@123");

		
				}
	
	
}