package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PracticeTest2 {
	
	WebDriver driver;
	
	@Test (priority = 1)
	public void openApp() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
	}
	@Test (priority = 2)
	public void testLogo() throws Exception {
		Thread.sleep(2000);
		 boolean logo = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		 Reporter.log("logo displayed :"+logo);
	}
	@Test (priority = 3)
	public void testLogin() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test (priority = 4)
	public void closeApp() {
		driver.close();
	}

}
