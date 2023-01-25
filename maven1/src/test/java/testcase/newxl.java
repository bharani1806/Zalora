package testcase;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class newxl {
	@DataProvider (name = "login")
	public static String[][] readxldata() throws IOException {


	String filelocation = "C:\\Users\\Thirukkumaran\\git\\repository4\\maven1\\zalora project.xlsx";
	XSSFWorkbook wb = new XSSFWorkbook(filelocation);
	XSSFSheet sheetname = wb.getSheetAt(0);
	int rownum = sheetname.getLastRowNum();
	System.out.println(rownum);
	int columnnum = sheetname.getRow(0).getLastCellNum();
	System.out.println(columnnum);
	
	String[][] data = new String[rownum][columnnum];
	for (int i = 1; i <=rownum; i++) {
		XSSFRow row = sheetname.getRow(i);
		for (int j = 0; j <columnnum ; j++) {
			XSSFCell column = row.getCell(j);
			DataFormatter db = new DataFormatter();
			String value = db.formatCellValue(column);
			//String value = column.getStringCellValue();
			//System.out.println(value);
			data [i-1] [j] = value;
			
			
		
			
		} 
		
}
	wb.close();
	return data;
	}
}
