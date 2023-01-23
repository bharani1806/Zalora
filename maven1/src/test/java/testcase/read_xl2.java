package testcase;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class read_xl2 {

	@DataProvider (name = "xldata")
	public static String[][] getxldata() throws IOException {
	//public static void main(String[] args) throws IOException {

		String fileloc = "C:\\Users\\Thirukkumaran\\git\\repository4\\maven1\\zalora project.xlsx";
		XSSFWorkbook wbook = new XSSFWorkbook(fileloc);
		XSSFSheet sheet = wbook.getSheetAt(0);
		int rownum = sheet.getPhysicalNumberOfRows();
		int columnnum = sheet.getRow(0).getLastCellNum();
		
		String testdata[][] = new String [rownum][columnnum];
		
		for(int i=1; i<=rownum;i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j=0; j<=columnnum; j++) {
				XSSFCell column = row.getCell(j);
				DataFormatter df = new DataFormatter();
				testdata [i-1][j]= df.formatCellValue(column);
				System.out.println(testdata [i-1][j]);
				//String value = df.formatCellValue(column);
				//System.out.println(value);
			}
			

		}


		wbook.close();
		return testdata;
		
	}

}
