import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ddtAssigment {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\Nis\\Desktop\\feb.xlsx");
		
		  Workbook wb = WorkbookFactory.create(fis);
		 Sheet sh = wb.getSheet("fbCredential");
		 Row rw = sh.getRow(0);
		 Cell cl = rw.getCell(0);
		 String url = cl.getStringCellValue();
		 String Uname = wb.getSheet("fbCredential").getRow(1).getCell(0).getStringCellValue();
		 String Pward = wb.getSheet("fbCredential").getRow(2).getCell(0).getStringCellValue();
		 
		 System.out.println(url);
		 System.out.println(Uname);
		 System.out.println(Pward);
		 
		
			
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				driver.get(url);
				driver.findElement(By.name("username")).sendKeys(Uname);
				driver.findElement(By.id("password")).sendKeys(Pward);
				driver.findElement(By.xpath("//button[text()='Log in']")).click();
				driver.close();
				

	}

}
