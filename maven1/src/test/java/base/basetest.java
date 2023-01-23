package base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
 
public class basetest {

	    public static WebDriver driver;
		public static Properties prop = new Properties();
		public static Properties loc = new Properties();

		public static FileReader fr;
		public static FileReader fr1;

		@BeforeTest
		public void setup() throws IOException {
			
			//this.driver =
			if (driver==null) {
				 fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
				 fr1 = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\locators.properties");

				prop.load(fr);
				loc.load(fr1);

			}
			if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
				//System.setProperty("webdriver.chrome.driver", null);
				driver.get(prop.getProperty("testurl"));
			}
		}
		@AfterTest
			public void teardowm() {
				//driver.close();
				System.out.println("teardown successfull");
				
			
			}
		}
		
		
		
		
		
	


