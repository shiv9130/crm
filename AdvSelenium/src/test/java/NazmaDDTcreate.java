import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NazmaDDTcreate {

	public static void main(String[] args) throws Exception {
		
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
        driver.findElement(By.name("campaignName")).sendKeys("Solar energy");
        WebElement target = driver.findElement(By.name("targetSize"));
        target.clear();
        target.sendKeys("400");
        driver.findElement(By.xpath("//button[text()='Create Campaign']")).click();
        
        Date dt = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String currentdt = sdf.format(dt);
        System.out.println(currentdt);
        
        Calendar cal = sdf.getCalendar();
        cal.add(Calendar.DAY_OF_MONTH,10);
        String expdate = sdf.format(cal.getTime());
        System.out.println(expdate);
        
        driver.findElement(By.linkText("Contacts")).click();
        driver.findElement(By.xpath("//span[text()='Create Contact']")).click();
        driver.findElement(By.name("organizationName")).sendKeys("QSP");
        driver.findElement(By.name("title")).sendKeys("Energy");
        driver.findElement(By.name("contactName")).sendKeys("headOfDept");
        driver.findElement(By.name("mobile")).sendKeys("9630321456");
        
        String pId = driver.getWindowHandle();
        Set<String> listId = driver.getWindowHandles();
        listId.remove(pId);
        for(String wId:listId) {
            driver.switchTo().window(wId);
            break;
        }
        
        
        
	}

}
