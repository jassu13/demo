package base;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import utilities.ExtentManager;
//import utilities.Xls_Reader;
public class BaseClass {

	public static Properties config = new Properties();
	//public static Xls_Reader excel = null;
	public static WebDriver driver = null;
	public static Logger app_logs = Logger.getLogger("qaLogger");
public ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;


	@BeforeSuite()
	public static void init() throws IOException {
		if (driver == null) {
			// load config property file
			FileInputStream fis = new FileInputStream(
			System.getProperty("user.dir") + "\\src\\test\\properties\\config.properties");
			config.load(fis);
			app_logs.debug("loading the config property file");
			if (config.getProperty("browser").equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\src\\test\\executables\\chromedriver.exe");
				driver = new ChromeDriver();
				app_logs.debug("chrome browser launched");
			} 
		
			driver.get(config.getProperty("testsiteURL"));
			driver.manage().window().maximize();

			// Global implicit Wait
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.navigate().refresh();

		}
	}
	


	
	@AfterSuite()
	public static void close() throws AddressException, MessagingException, IOException {
		
		//if(driver!=null) {
		
	  driver.close();
		 	//}
	}

}
