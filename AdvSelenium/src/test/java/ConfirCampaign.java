import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirCampaign {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Nis\\Desktop\\Browser.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String browser = prop.getProperty("Browser");
		String url = prop.getProperty("URL");
		String uname = prop.getProperty("Username");
		String pward = prop.getProperty("Password");
		
		System.out.println(browser);
		System.out.println(url);
		System.out.println(uname);
		System.out.println(pward);
		
		WebDriver driver = null;
		
		//crossBrowsertesting
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else{
			driver = new ChromeDriver();
		}
		
		//enter url
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(url);
        
        driver.findElement(By.id("username")).sendKeys(uname);
        driver.findElement(By.id("inputPassword")).sendKeys(pward);
        driver.findElement(By.xpath("//button[text()='Sign In']")).click();
        
        Random rno= new Random();
        int no = rno.nextInt(999);
        System.out.println("no is:"+no);
        
        driver.findElement(By.linkText("Campaigns")).click();
        driver.findElement(By.xpath("//span[text()='Create Campaign']")).click();
        driver.findElement(By.name("campaignName")).sendKeys("Solar energy"+no);
        WebElement target = driver.findElement(By.name("targetSize"));
        target.clear();
        target.sendKeys("400");
        
        driver.findElement(By.xpath("//button[text()='Create Campaign']")).click();        
        
    		/*String parentid= driver.getWindowHandle();
    		Set<String> allId = driver.getWindowHandles();
    		allId.remove(parentid);
    		for(String windowid:allId) {
    			driver.switchTo().window(windowid);
    		}*/
    		 WebElement el = driver.findElement(By.xpath("//div[@role='alert']"));
    		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    		 wait.until(ExpectedConditions.visibilityOf(el));
    		 String text = el.getText();
    		 if(text.contains("Solar energy"+no)) {
    			 System.out.println("pass");
    		 }else {
    			 System.out.println("failed");
    		 }
    		
    		System.out.println(el);
    		
	}

}
