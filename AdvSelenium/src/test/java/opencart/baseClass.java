package opencart;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class baseClass { //to achieve reusability using baseclass as a parent class
	
public WebDriver driver;
	
	@BeforeClass //only used once
	public void setup() {
		
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/?__cf_chl_tk=PdCWNDro6iM_bDgOEk8URfDfil73JuZwg9W_8zcKVVw-1750914633-1.0.1.1-YIp34UkL7XR1qXZjDZvqRVYr8F2l_dSJC..6C7UMWu4");
	}
	@AfterClass //only used once
	public void tearDown() {
		driver.close();
		
	}
	
	public String randomString() {
		String raplha = RandomStringUtils.randomAlphabetic(5);
		return raplha;
	}
	public String randomNumber() {
		String rno = RandomStringUtils.randomNumeric(10);
		return rno;
	}
	public String randomMix() {
		String a = RandomStringUtils.randomAlphabetic(3);
		String n = RandomStringUtils.randomNumeric(3);
		return (a+"@"+n);
		
	}

}
