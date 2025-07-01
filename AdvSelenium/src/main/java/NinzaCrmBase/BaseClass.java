package NinzaCrmBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import GenericUtilityNinza.ExcelFileUtility;
import GenericUtilityNinza.javaUtility;
import GenericUtilityNinza.propertyFileUtility;
import WebDriverUtility.WebDriverUtil;
import objectRepoNinzaCRm.loginPage;

public class BaseClass {
	
	public static WebDriver sdriver= null;
    public propertyFileUtility prop = new propertyFileUtility();
	public javaUtility ju = new javaUtility();
	public ExcelFileUtility eu = new ExcelFileUtility();
	public WebDriverUtil wd = new WebDriverUtil();
	WebDriver driver = null;
	
	@BeforeSuite(groups= {"smoke","regression"})
	public void configureBs() {
		Reporter.log("Before suite DB connectivity", true);
	}
    
	@BeforeTest(groups= {"smoke","regression"})
	public void configureBt() {
		Reporter.log("pre-conditions", true);
	}
	
	@BeforeClass(groups= {"smoke","regression"})
	public void configureBc() throws IOException {
		propertyFileUtility pu = new propertyFileUtility();
		String browser = pu.propertyFileUtil("Browser");
		String url = pu.propertyFileUtil("URL");
		
		//cross browser testing
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else {
			driver = new ChromeDriver();
		}
	//navigate to url
		sdriver = driver;
		wd.maximize(driver);
		wd.implicitWait(driver);
		driver.get(url);
	}	
		//login
		
		@BeforeMethod(groups= {"smoke","regression"})
		public void configureBm() throws IOException {
			String un = prop.propertyFileUtil("Username");
			String pw = prop.propertyFileUtil("Password");
		    loginPage lp = new loginPage(driver);
		    lp.username(un);
		    lp.password(pw);
		    Reporter.log("sucessfull login", true);
		}
		
		@AfterMethod(groups= {"smoke","regression"})
		public void configureAm() {
			
			
		}
		
	}
	
	
	
	
	


