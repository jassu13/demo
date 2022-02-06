package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pages.AddressPage;

public class TC3AddAddress extends BaseClass {

	
	
	@Test
	public void updateAdress() {
		test.log(LogStatus.INFO, "Add Address test started");
		app_logs.info("Add Address test started");
		AddressPage ap = new AddressPage(driver);
		test.log(LogStatus.INFO, "Address Book Link Clicked");
		ap.clickaddBtn();
		test.log(LogStatus.INFO, "New Address Button Clicked");
		ap.clickNewAdress();
		test.log(LogStatus.INFO, "User Details Entered");
		ap.addAddress("deep", "dhillon", "TD bank", "village dr","Brampton", "L3rt4");
		ap.addCountry("Togo");
		ap.addState("Bristol");
		test.log(LogStatus.INFO, "Continue Button Clicked");
		ap.doClickContinue();
		String actual = driver.getTitle();
		String expected="Address Book";
		Assert.assertEquals(actual, expected);
		app_logs.info("Add Address test completed");
		test.log(LogStatus.INFO, "Add Address test completed");
		
	}
					
	}