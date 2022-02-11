package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import base.BasePage;

public class AddToCart extends BasePage {
	public AddToCart(WebDriver driver) {
		super(driver);

		
		}
	@FindBy(linkText="Components")
	public WebElement cmpo;
	
	@FindBy(linkText="Monitors (2)")
	public WebElement dropdwn;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div[2]/div/div[1]/a/img")
	public WebElement img;

	@FindBy(id="input-quantity")
	public WebElement qnt;
	
	@FindBy(id="cart-total")
	public WebElement ctotal;
	
	@FindBy(id="button-cart")
	public WebElement atc;


	
	@FindBy(xpath="//*[@id=\"cart\"]/button")
	public WebElement vc;
	
	@FindBy(xpath="//*[@id='cart']/ul/li[2]/div/p/a[1]")
	public WebElement clickc;



	@FindBy(linkText="Checkout")
	public WebElement chk;
	

	public void addCart() {
	
    	cmpo.click();
    	dropdwn.click();
    	img.click();
    	qnt.clear();
    	qnt.sendKeys("3");
    	
	}
	public void scrollBtn(WebDriver driver) { 
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,550)", "");
		atc.click();
	
		
	}
	
	public void viewCart() {
	vc.click();
	clickc.click();
	}
	

	public void checkoutBtn(WebDriver driver) { 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,650)", "");
		chk.click();
	
		
	}

	}
