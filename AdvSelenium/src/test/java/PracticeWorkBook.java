import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PracticeWorkBook {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\Nis\\Desktop\\Nazma.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("credentials");
		Row rw= sh.getRow(0);
		Cell cl = rw.getCell(0);
		String browser = cl.getStringCellValue();
		Row rw1= sh.getRow(0);
		Cell cl1 = rw.getCell(1);
		String url = cl.getStringCellValue();

	
		String userId = wb.getSheet("credentials").getRow(2).getCell(0).getStringCellValue();
		String Value = wb.getSheet("credentials").getRow(4).getCell(1).getStringCellValue();
		System.out.println(userId);
		System.out.println(Value);
		

	}

}
