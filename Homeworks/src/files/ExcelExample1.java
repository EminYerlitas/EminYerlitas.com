package files;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelExample1 {

	public static void main(String[] args) throws IOException {
		String filePath = System.getProperty("user.dir") +"\\test.data\\excel.xlsx";
		FileInputStream fis=new FileInputStream(filePath);
		

		// Read the whole excel file
		Workbook book = new XSSFWorkbook(fis);

		// Get the sheet from the file
		Sheet sheet = book.getSheet("Sheet1");

		// Get the row (with index 2) from the sheet
		Row row2 = sheet.getRow(2);

		// Get the cell (with index 1) from the row
		Cell cell1 = row2.getCell(1);

		// Print the information of the cell
		System.out.println(cell1.toString());
	}

}
