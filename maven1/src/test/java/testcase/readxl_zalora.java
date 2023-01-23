package testcase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class readxl_zalora {

	
	
	@DataProvider (name="zaloradata")
	public  String[][] getdata(Method m) throws IOException {

		String xlsheetname = m.getName();
		File f = new File("C:\\Users\\Thirukkumaran\\git\\repository4\\maven1\\zalora project.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wbook = WorkbookFactory.create(fis);
		Sheet sheet = wbook.getSheet(xlsheetname);
		
		int rownum = sheet.getLastRowNum();
        System.out.println(rownum);
		Row row = sheet.getRow(0);
		int columnnum = row.getLastCellNum();
        System.out.println(columnnum);
		//Cell column = row.getCell(0);
		//String value = column.getStringCellValue();
		//System.out.println(value);
		
		DataFormatter df = new DataFormatter();
		
		String testdata[][] = new String [rownum][columnnum];
		for (int i=1;i<=rownum;i++) {
			for(int j=0;j<columnnum;j++) {
				testdata [i-1][j]= df.formatCellValue(sheet.getRow(i).getCell(j));
				System.out.println(testdata [i-1][j]);
			}
		}

		return testdata;
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
