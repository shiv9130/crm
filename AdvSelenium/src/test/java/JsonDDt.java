import java.io.FileInputStream;
import java.io.FileReader;
import java.time.Duration;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsonDDt {

	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("C:\\Users\\Nis\\Desktop\\data.json");//read the file using 
        JSONParser parser = new JSONParser();//parse the json file into java file using json parser class
        Object ob = parser.parse(fr);
        
        
		//convert java object into Jsonobject using typecasting
        JSONObject obj = (JSONObject) ob;
        
       String brow = obj.get("Browser").toString();//to string convert any object into string
       System.out.println(brow);
       String url = obj.get("URL").toString();
       String un = obj.get("Username").toString();
       String pw = obj.get("Password").toString();
       
       System.out.println(url);
       System.out.println(un);
       System.out.println(pw);
       
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.get(url);
       driver.findElement(By.id("username")).sendKeys(un);
       driver.findElement(By.id("inputPassword")).sendKeys(pw);
       driver.findElement(By.xpath("//button[text()='Sign In']")).click();
       
       Random random = new Random();
       int rno = random.nextInt(999);
       
       FileInputStream fs=new FileInputStream("C:\\Users\\Nis\\Desktop\\Nazma.xlsx");
		Workbook wb= WorkbookFactory.create(fs);
		Sheet sh = wb.getSheet("Testdata");
		Row row = sh.getRow(1);
		Cell cell = row.getCell(0);
		String camp = cell.getStringCellValue();
		System.out.println(camp);
		
		Sheet sh1 = wb.getSheet("Testdata");
		Row row1 = sh1.getRow(1);
		Cell cell1 = row1.getCell(1);
		String tgt = cell1.getStringCellValue();
		System.out.println(tgt);
		
		driver.findElement(By.linkText("Campaigns")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Create Campaign']")).click();
		driver.findElement(By.name("campaignName")).sendKeys(camp+rno);
		WebElement target = driver.findElement(By.name("targetSize"));
		target.clear();
		target.sendKeys(tgt+rno);
		driver.findElement(By.xpath("//button[text()='Create Campaign']")).click();
		
        
		
       
		
		
		
	}

}
