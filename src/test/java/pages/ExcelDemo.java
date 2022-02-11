package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class ExcelDemo extends BasePage {
	
	public ExcelDemo(WebDriver driver) {
		super(driver);
		}
	@FindBy(id="input-email")
	public WebElement lgntxt;
	
	@FindBy(id="input-password")
	public WebElement passtxt;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement lgbtn;
	
	@FindBy(linkText="Logout")
	public WebElement lgout;
	@FindBy(linkText="Continue")
	public WebElement ctn;
	
public void doLogin(String username, String password) {
	lgntxt.sendKeys(username);
	passtxt.sendKeys(password);
	lgbtn.click();
	lgout.click();
	ctn.click();
}
}
