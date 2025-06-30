package opencart;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import opencartRepository.HomePageO;
import opencartRepository.accountRegisterPage;

public class accountRegTest extends baseClass {
	
	@Test
	public void verifyAcc() {
		
		HomePageO hp = new HomePageO(driver);//import homepage and invoke constructor
		hp.clickAccount();
		hp.clickRegister();
		
		accountRegisterPage ar = new accountRegisterPage(driver);
		ar.fName(randomString().toUpperCase());
		ar.lName(randomString().toUpperCase());
		ar.email(randomString()+"@gmail.com");
		ar.password(randomMix());
		ar.privacy();
		ar.continueB();
	String msg=ar.confirmMessage();
	Assert.assertEquals(msg, "Your Account Has Been Created!");
	
	}
	

}
