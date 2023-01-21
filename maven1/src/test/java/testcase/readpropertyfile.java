package testcase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class readpropertyfile {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\Thirukkumaran\\OneDrive\\Desktop\\java\\maven1\\src\\test\\resources\\configfiles\\config.properties");
        
		Properties p = new Properties();
		p.load(fr);
		
		
		
		System.out.println(p.getProperty("browser"));
	
	
	
	}

}
