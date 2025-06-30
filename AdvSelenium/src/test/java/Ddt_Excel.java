import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ddt_Excel {
	


public static void main(String[] args) throws Exception {
	 FileInputStream fis = new FileInputStream("C:\\Users\\Nis\\Desktop\\insta.xlsx");
	
	  Workbook wb = WorkbookFactory.create(fis);
	 Sheet sh = wb.getSheet("InstagramCredential");
	 Row rw = sh.getRow(0);
	 Cell cl = rw.getCell(0);
	 String url = cl.getStringCellValue();
	 String Uname = wb.getSheet("InstagramCredential").getRow(1).getCell(0).getStringCellValue();
	 String Pward = wb.getSheet("InstagramCredential").getRow(2).getCell(0).getStringCellValue();
	 
	 System.out.println(url);
	 System.out.println(Uname);
	 System.out.println(Pward);
	 
	
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get(url);
			driver.findElement(By.id("email")).sendKeys(Uname);
			driver.findElement(By.id("pass")).sendKeys(Pward);
			driver.findElement(By.name("login")).click();
			
	
	 

}


}
