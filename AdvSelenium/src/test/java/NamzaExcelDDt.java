import java.io.FileInputStream;
import java.time.Duration;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NamzaExcelDDt {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Nis\\Desktop\\Nazma.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh =wb.getSheet("credentials");
		Row rw = sh.getRow(0);
		Cell cl = rw.getCell(0);
		String brow = cl.getStringCellValue();
		Row rw1 = sh.getRow(1);
		Cell cl1 = rw1.getCell(0);
		String url = cl1.getStringCellValue();
		String Uname = wb.getSheet("credentials").getRow(2).getCell(0).getStringCellValue();
		String Pward = wb.getSheet("credentials").getRow(3).getCell(0).getStringCellValue();
		
		
		System.out.println(brow);
		System.out.println(url);
		System.out.println(Uname);
		System.out.println(Pward);
		
		//cross browser testing
		WebDriver driver= null;
		
		if(brow.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}else if (brow.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
		}else if (brow.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
		}else {
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(url);
		
		driver.findElement(By.id("username")).sendKeys(Uname);
		driver.findElement(By.id("inputPassword")).sendKeys(Pward);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		Thread.sleep(3000);
		Random random = new Random();
		int randomNo = random.nextInt(100);
		System.out.println(randomNo);
		driver.close();
		
		



	}

}

