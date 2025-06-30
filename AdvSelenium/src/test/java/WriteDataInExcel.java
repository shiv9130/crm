import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataInExcel {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis= new FileInputStream("C:\\Users\\Nis\\Desktop\\Nazma.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);//control workbook
		
		Sheet sh = wb.getSheet("Testdata");//control sheet
		
		Row row = sh.getRow(1);//control row
		
		Cell cell = row.createCell(2);//control create cell
		
		cell.setCellType(CellType.STRING);//setcellType
		cell.setCellValue("Pass");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Nis\\Desktop\\Nazma.xlsx");
		wb.write(fos);
		
		
		
		

	}

}
