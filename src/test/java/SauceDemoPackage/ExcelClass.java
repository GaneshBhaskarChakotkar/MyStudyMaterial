package SauceDemoPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelClass {

	public static String[][] getExcelClassData() throws IOException{
	
		File file = new File("C:\\AGILE NOTES\\Copy of LoginExcel.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("mySheet");
		int rows = sheet.getLastRowNum(); // Total rows
        int cols = sheet.getRow(0).getLastCellNum(); // Total columns

		String[][] str = new String[rows][cols];
		
		for(int i=0; i<rows; i++) {
			XSSFRow row = sheet.getRow(i);
			
			for(int j=0; j<cols; j++) {
				XSSFCell col = row.getCell(j);
				str[i][j] = col.getStringCellValue();
				
			}
		}
		wb.close();		
		return str;
	}
}
