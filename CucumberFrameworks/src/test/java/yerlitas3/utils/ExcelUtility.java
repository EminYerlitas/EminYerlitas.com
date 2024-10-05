package yerlitas3.utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	private static Workbook book;
	private static Sheet sheet;

	private static void openExcel(String filePath) {
		try {
			FileInputStream fis = new FileInputStream(filePath);
			book = new XSSFWorkbook();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

	private static void loadSheet(String sheetName) {
		sheet = book.getSheet(sheetName);

	}

	private static int rowCount() {
		return sheet.getPhysicalNumberOfRows();
	}

	private static int colCount(int rowIndex) {

		return sheet.getRow(rowIndex).getLastCellNum();

	}

	private static String getCellData(int rowIndex, int colIndex) {
		return sheet.getRow(rowIndex).getCell(colIndex).toString();

	}

	public static Object[][] cellIntoArray(String filePath, String sheetName) {
		openExcel(filePath);
		loadSheet(sheetName);
		int rowNumber = rowCount();
		int colNumber = colCount(0);
		Object[][] data = new Object[rowNumber - 1][colNumber];
		for (int row = 1; row < rowNumber; row++) {
			for (int col = 0; col < colNumber; col++) {
				data[row - 1][col] = getCellData(row, col);
			}
		}
		return data;

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
