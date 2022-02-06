package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;

public class AddressPage extends BasePage {
	 
	public AddressPage(WebDriver driver) {
		super(driver);
		}
	
	@FindBy(linkText="Address Book")
	public WebElement adbok;
	
	@FindBy(linkText="New Address")
	public WebElement nwadrs;
	
	@FindBy(id="input-firstname")
	public WebElement ftname;
	
	@FindBy(id="input-lastname")
	public WebElement ltname;
	
	@FindBy(id="input-company")
	public WebElement cmp;
	
	@FindBy(id="input-address-1")
	public WebElement add;
	
	@FindBy(id="input-city")
	public WebElement cty;
	
	@FindBy(id="input-postcode")
	public WebElement pcode;
	
	public void clickaddBtn() {
		adbok.click();
	}
	
	public void clickNewAdress() {
		nwadrs.click();
	}
	public void addAddress(String ufrstname, String ulstname, String ucmp, String uadd, String ucty, String upcode) {
		ftname.sendKeys(ufrstname);
		ltname.sendKeys(ulstname);
		cmp.sendKeys(ucmp);
		add.sendKeys(uadd);
		cty.sendKeys(ucty);
		pcode.sendKeys(upcode);
	
		
	}
	@FindBy(xpath="//select[@id='input-country']")
	public WebElement ct;
	
	public void addCountry(String ncity) {
		Select s=new Select(ct);
		s.selectByVisibleText(ncity);
	}
	
	@FindBy(xpath="//select[@id='input-zone']")
	public WebElement stat;
	
	public void addState(String nstate) {
		Select s=new Select(stat);
		s.selectByVisibleText(nstate);
	}
	@FindBy(xpath="//input[@value='Continue']")
	public WebElement btncontne;
	
	public void doClickContinue() {
		btncontne.click();
	}

	
}