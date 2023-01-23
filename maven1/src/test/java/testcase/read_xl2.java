package testcase;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read_xl2 {

	public static void main(String[] args) throws IOException {
   
		String fileloc = "C:\\Users\\Thirukkumaran\\git\\repository4\\maven1\\zalora project.xlsx";
		XSSFWorkbook wbook = new XSSFWorkbook(fileloc);
		XSSFSheet sheet = wbook.getSheetAt(0);

		for(int i=0; i<=1;i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j=0; j<=1; j++) {
				XSSFCell column = row.getCell(j);
				DataFormatter df = new DataFormatter();

				String value = df.formatCellValue(column);
				System.out.println(value);
			}
			

		}


		wbook.close();
		
	}

}
