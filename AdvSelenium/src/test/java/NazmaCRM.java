import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NazmaCRM {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://49.249.28.218:8098/dashboard");
		driver.findElement(By.id("username")).sendKeys("rmgyantra");
		driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Thread.sleep(2000);
		//driver.switchTo().alert().accept();
		driver.findElement(By.linkText("Campaigns")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Create Campaign']")).click();
		driver.findElement(By.name("campaignName")).sendKeys("save trees");
		WebElement target = driver.findElement(By.name("targetSize"));
		target.clear();
		target.sendKeys("500");
		WebElement date = driver.findElement(By.name("expectedCloseDate"));
		date.sendKeys("15-05-2025");
		driver.findElement(By.name("targetAudience")).sendKeys("400");
	    driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("nature is future");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
