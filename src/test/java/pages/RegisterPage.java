package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import base.BasePage;

public class RegisterPage extends BasePage {
	 
	public RegisterPage(WebDriver driver) {
		super(driver);
		}
	
	@FindBy(id="input-firstname")
	public WebElement fname;
	
	@FindBy(id="input-lastname")
	public WebElement lname;
	
	@FindBy(id="input-email")
	public WebElement emailtxt;
	
	@FindBy(id="input-telephone")
	public WebElement tphone;
	
	@FindBy(id="input-password")
	public WebElement pswrd;
	
	@FindBy(id="input-confirm")
	public WebElement cpswrd;
	
	@FindBy(name="agree")
	public WebElement chkbox;
	
	@FindBy(xpath="//div[contains(text(),'First Name must be between 1 and 32 characters!')]")
	public WebElement errfname;
	@FindBy(xpath="//div[contains(text(),'Last Name must be between 1 and 32 characters!')]")
	public WebElement errlname;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement sbmitbtn;
	
	
	

	public void doAddUser(String frstname, String lstname, String emailtext, String tlephone, String opswrd, String cnpswrd) {
		fname.sendKeys(frstname);
		lname.sendKeys(lstname);
		emailtxt.sendKeys(emailtext);
		tphone.sendKeys(tlephone);
		pswrd.sendKeys(opswrd);
		cpswrd.sendKeys(cnpswrd);
		chkbox.click();
		sbmitbtn.click();
		
	}
	
	public void validateErrormsg(String emailtext, String tlephone, String opswrd, String cnpswrd) {
		emailtxt.sendKeys(emailtext);
		tphone.sendKeys(tlephone);
		pswrd.sendKeys(opswrd);
		cpswrd.sendKeys(cnpswrd);
		chkbox.click();
		sbmitbtn.click();
		String actual=errfname.getText();
		String expe="First Name must be between 1 and 32 characters!";
		Assert.assertEquals(actual,expe);
		String actualnme=errlname.getText();
		String expenme="Last Name must be between 1 and 32 characters!";
		Assert.assertEquals(actualnme,expenme);
	}
	
	
	
	
}