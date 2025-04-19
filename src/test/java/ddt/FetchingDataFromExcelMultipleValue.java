package ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromExcelMultipleValue {
	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis = new FileInputStream("R:\\QSpider\\AdvanceSelenium\\FetchExcelMultipleFile.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("sheet1");
		Row row = sheet.getRow(2);
		Row row1 = sheet.getRow(3);
		Cell cell = row.getCell(1);
		Cell cell1 = row1.getCell(1);
		long numericValue = (long) cell.getNumericCellValue();
		System.out.println(numericValue);
		RichTextString splCharacter = cell1.getRichStringCellValue(); //special characters
		System.out.println(splCharacter);
	
	}
}
