import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetAllDataRowExcel {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\Nis\\Desktop\\Nazma.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("credentials");
		Row rw = sh.getRow(0);
		Cell cl = rw.getCell(0);
		cl.getStringCellValue();
		
		int count = sh.getLastRowNum();
		System.out.println(count);
		for(int i=4;i<=count;i++) {
		Row row = sh.getRow(i);
		String data1 = row.getCell(0).toString();
		
		String data2 = row.getCell(1).toString();
		
		System.out.println(data1+"\t"+data2);
		
		
		
		    
		
		}

	}

}
