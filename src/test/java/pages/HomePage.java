package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import base.BasePage;

public class HomePage extends BasePage {
	 
	public HomePage(WebDriver driver) {
		super(driver);
		}
	
	
	
	@FindBy(xpath=("//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]"))
	public WebElement myacount;
	
	public void doClickMyAccount() {
			Assert.assertEquals(true, myacount.isDisplayed());
		myacount.click();
		
	}	
	@FindBy(xpath=("//a[contains(text(),'Register')]"))
	public WebElement rgbtn;
	
	public void doClickRegister() {
		Assert.assertEquals(true, rgbtn.isEnabled());
		rgbtn.click();
	
		
	}
	
	@FindBy(xpath=("//a[contains(text(),'Login')]"))
	public WebElement lgbtn;
	
	public void doClickLogin() {
		Assert.assertEquals(true, lgbtn.isEnabled());
		lgbtn.click();
	}
		
}
	
	
	
	


