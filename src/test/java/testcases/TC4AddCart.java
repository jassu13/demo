package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pages.AddToCart;


public class TC4AddCart extends BaseClass {

	
	
	@Test
	public void clickCart() {
	test.log(LogStatus.INFO, "Add To Cart test started");
		app_logs.info("Add To Cart test started");
		AddToCart ac=new AddToCart(driver);
		test.log(LogStatus.INFO, "Add To Cart Button Clicked");
		ac.addCart();
		ac.scrollBtn(driver);
		test.log(LogStatus.INFO, "View Cart Button Clicked");
		ac.viewCart();
		ac.checkoutBtn(driver);
		

		String actual = driver.getTitle();
		String expected="Shopping Cart";
		Assert.assertEquals(actual, expected);
		app_logs.info("Add To Cart test completed");
		test.log(LogStatus.INFO, "Add To Cart test completed");
		
	}
}