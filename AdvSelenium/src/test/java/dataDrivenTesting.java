import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dataDrivenTesting {

	public static void main(String[] args) throws Exception {
		
		String expectedUrl = "https://www.instagram.com/";
		String expUn = "shivam.singh09";
		String expPw = "7415903567";
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Nis\\Desktop\\commondata1.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		String brow = prop.getProperty("Browser");
		String url = prop.getProperty("URL");
		String un = prop.getProperty("Username");
		String pw = prop.getProperty("Password");
		
		System.out.println("browser is:"+brow);
		System.out.println("url is:"+url);
		System.out.println("un is:"+un);
		System.out.println("pwd is:"+pw);
		
		//cross browser testing
		//launch browser and maximize
		WebDriver driver = null;
		if(brow.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if(brow.equalsIgnoreCase("edge")){
			driver=new EdgeDriver();
		}else if (brow.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}else {
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//navigate to instagram
		driver.get(url);
		
		String actualUrl = driver.getCurrentUrl();
		if(actualUrl.equals(expectedUrl)) {
			System.out.println("url is same");
		}else {
			System.out.println("different url");
		}
		
		WebElement actUn = driver.findElement(By.name("username"));
		actUn.sendKeys(un);
		String actUname = actUn.getAttribute("value");
		
		if(actUname.equals(expUn)) {
			System.out.println("Uname is same");
		}else {
			System.out.println("different Uname");
		}
		
		WebElement actPwd = driver.findElement(By.name("password"));
		actPwd.sendKeys(pw);
		String actPward = actPwd.getAttribute("value");
		
		if(actPward.equals(expPw)) {
			System.out.println("pward is same");
		}else {
			System.out.println("different pward");
		}
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		

	}

}
