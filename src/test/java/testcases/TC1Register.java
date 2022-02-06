package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pages.HomePage;
import pages.RegisterPage;


public class TC1Register extends BaseClass {

	
	
	@Test
	public void registerUser() {
	
		test.log(LogStatus.INFO, "User Registration test started");
	    app_logs.info("User Registration test started");
		HomePage hp = new HomePage(driver);
		test.log(LogStatus.INFO, "My Account Button Clicked");
		
		hp.doClickMyAccount();
		test.log(LogStatus.INFO, "Register Button Clicked");
		hp.doClickRegister();
		
		RegisterPage rp=new RegisterPage(driver);
	    test.log(LogStatus.INFO, "User Details Entered");
		rp.doAddUser("Jasveer", "Kaur", "Jasveer23@gmail.com", "6783423", "hello@123", "hello@123");
		
		String actual = driver.getTitle();
		String expected="Register Account";
		
		Assert.assertEquals(actual, expected);
		app_logs.info("User Registration test completed");
		test.log(LogStatus.INFO, "User Registration test completed");
					
	}
	
	@Test
	public void emptyFieldValidation() throws InterruptedException {
	
		test.log(LogStatus.INFO, "Empty Filed Validation test started");
	   app_logs.info("Empty Filed Validation test started");
		HomePage hp = new HomePage(driver);
		hp.doClickMyAccount();
		hp.doClickRegister();
	    RegisterPage rp=new RegisterPage(driver);
		rp.validateErrormsg("Jass23@gmail.com", "6783423", "hello@123", "hello@123");
	    app_logs.info("Empty Filed Validation test completed");
		test.log(LogStatus.INFO, "Empty Filed Validation test completed");
					
	}
	
	
}
