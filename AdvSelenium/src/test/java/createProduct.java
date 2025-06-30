import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class createProduct {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://49.249.28.218:8098");
		driver.findElement(By.id("username")).sendKeys("rmgyantra");
		driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.xpath("//span[text()='Add Product']")).click();
		driver.findElement(By.name("productName")).sendKeys("Bikes");
		
		WebElement dd = driver.findElement(By.name("productCategory"));
		Select s = new Select(dd);
		s.selectByValue("Others");
		
		WebElement qty = driver.findElement(By.name("quantity"));
		qty.clear();
		qty.sendKeys("100");
		
		WebElement pr = driver.findElement(By.name("price"));
		pr.clear();
		pr.sendKeys("100000");
		
		WebElement dd1 = driver.findElement(By.name("vendorId"));
		Select s1 = new Select(dd1);
		s1.selectByValue("VID_014");
		
		driver.findElement(By.xpath("//button[text()='Add']")).click();

	}

}
