package PracticePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcel {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		
		File f1 = new File("C:\\Users\\LENOVO\\Desktop\\NotesMyInterveiw prep\\old mock\\MXF.xlsx");
		FileInputStream fis = new FileInputStream(f1);

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");

		XSSFRow row;
		XSSFCell col;
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(rows);
		System.out.println(rows);
		for (int i=0; i<rows; i++) {
		row = sheet.getRow(i);
			for(int j=0; j<cols; j++) {
				col = row.getCell(j);
				System.out.println(col);
			}
		}
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\LENOVO\\Desktop\\NotesMyInterveiw prep\\old mock\\MXF.xlsx");

		 sheet.getRow(1).createCell(2).setCellValue("major");
		 sheet.getRow(2).createCell(2).setCellValue("minor");
		 wb.write(fos);
		 wb.close();

	}
}
