package PracticePackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Execelll {

	public static void main(String[] args) throws FileNotFoundException {
		File f1 = new File("C:\\Users\\LENOVO\\Desktop\\NotesMyInterveiw prep\\old mock\\MXF.xlsx");
		FileOutputStream fis = new FileOutputStream(f1);
		XSSFWorkbook wb = new XSSFWorkbook();
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
		XSSFRow row;
		XSSFCell col;
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(rows);
		System.out.println(cols);
	}
	
}
