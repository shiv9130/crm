import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class createLead {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://49.249.28.218:8098");
		driver.findElement(By.id("username")).sendKeys("rmgyantra");
		driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.xpath("//span[text()='Create Lead']")).click();
		driver.findElement(By.name("phone")).sendKeys("9852147634");
		driver.findElement(By.name("email")).sendKeys("shiv@gmail.com");
		driver.findElement(By.name("secondaryEmail")).sendKeys("shiv1@gmail.com");
		driver.findElement(By.xpath("(//*[name()='svg' and @aria-hidden='true'])[2]")).click();
		
		

	}

}
