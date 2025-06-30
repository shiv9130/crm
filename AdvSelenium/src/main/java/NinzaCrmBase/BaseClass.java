package NinzaCrmBase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import GenericUtilityNinza.ExcelFileUtility;
import GenericUtilityNinza.javaUtility;
import GenericUtilityNinza.propertyFileUtility;
import WebDriverUtility.WebDriverUtil;

public class BaseClass {
	
	WebDriver driver;
    public propertyFileUtility prop = new propertyFileUtility();
	public javaUtility ju = new javaUtility();
	public ExcelFileUtility eu = new ExcelFileUtility();
	public WebDriverUtil wd = new WebDriverUtil();
	
	@BeforeSuite(groups= {"smoke","regression"})
	public void configureBs() {
		Reporter.log("Before suite DB connectivity", true);
	}
    
	@BeforeTest(groups= {"smoke","regression"})
	public void configureBt() {
		Reporter.log("pre-conditions", true);
	}
	
	
	
	
	}


