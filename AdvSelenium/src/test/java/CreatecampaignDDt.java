import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreatecampaignDDt {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Nis\\Desktop\\Browserc.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String browser = prop.getProperty("Browser");
		String url = prop.getProperty("URL");
		String un = prop.getProperty("Username");
		String pw = prop.getProperty("Password");
		
		System.out.println(url);
		
		//cross Browser testing
		
		WebDriver driver = null;
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}else  {
			driver=new ChromeDriver();
		}	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.id("inputPassword")).sendKeys(pw);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		driver.findElement(By.linkText("Campaigns")).click();
		driver.findElement(By.xpath("//span[text()='Create Campaign']")).click();
		
		FileInputStream wfis = new FileInputStream("C:\\Users\\Nis\\Desktop\\Nazma.xlsx");
		Workbook wb = WorkbookFactory.create(wfis);
		Sheet sh = wb.getSheet("Testdata");
		Row row = sh.getRow(1);
		Cell cell = row.getCell(0);
		String campN = cell.getStringCellValue();
		Sheet sh1=wb.getSheet("Testdata");
		Row row1 = sh1.getRow(1);
		Cell cell1 = row1.getCell(1);
		String tgt = cell1.getStringCellValue();
		
		Random rno= new Random();
		int no = rno.nextInt(999);
		
		System.out.println(campN+no);
		System.out.println(tgt);
		
		driver.findElement(By.name("campaignName")).sendKeys(campN+no);
		WebElement trgt = driver.findElement(By.name("targetSize"));
		trgt.clear();
		trgt.sendKeys(tgt+rno);
		driver.findElement(By.xpath("//button[text()='Create Campaign']")).click();
		
	
		
		
	}

 }

