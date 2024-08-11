package files;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CompaniesExcel {

	public static void main(String[] args) throws IOException {
		//1-Locate the file
		String filePath = System.getProperty("user.dir") + "\\test.data\\Homework.xlsx";
		//2-Read the file
		FileInputStream fis = new FileInputStream(filePath);
		//3-Read the excel file
		Workbook book = new XSSFWorkbook(fis);
		//4-Get the companies sheet
		Sheet companies = book.getSheet("Companies");
		//5-Get the index 2 row
		Row row2 = companies.getRow(2);
		//6-Create an ArrayList
		List<Object> a = new ArrayList<>();
		//7-Add cells in the row while using enhanced for loop
		for (Cell cells : row2) {
			a.add(cells);
		}
		System.out.println(a);
		//7-Create a Set of Doubles
		Set<Double> b = new HashSet<>();
		//8-Add value of last cells to the Set while using for loop
		for (int i = 1; i <companies.getPhysicalNumberOfRows(); i++) {
			double lastcells = companies.getRow(i).getCell(4).getNumericCellValue();
			b.add(lastcells);
		}
		System.out.println(b);
		//9-close fis and book to prevent resource leak
		fis.close();
		book.close();
	}
}
