package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import base.BasePage;

public class LoginPage extends BasePage {
	 
	public LoginPage(WebDriver driver) {
		super(driver);
		}
	
	@FindBy(id="input-email")
	public WebElement lgntxt;
	
	@FindBy(id="input-password")
	public WebElement passtxt;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement lgbtn;
	
	@FindBy(xpath="//body/div[@id='account-login']/div[1]")
	public WebElement ermsg;
	
	
	public void doLogin(String myemail, String mypassword) {
		Assert.assertEquals(true, lgntxt.isEnabled());
		lgntxt.sendKeys(myemail);
		Assert.assertEquals(true, passtxt.isEnabled());
		passtxt.sendKeys(mypassword);
		Assert.assertEquals(true, lgbtn.isDisplayed());
		lgbtn.click();
	
	}
	
	public void invalidLogin(String myemail, String mypassword) {
		lgntxt.sendKeys(myemail);
		passtxt.sendKeys(mypassword);
		Assert.assertEquals(true, lgbtn.isDisplayed());
		lgbtn.click();
		ermsg.getText();
	
	}
}
	
	