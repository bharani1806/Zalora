package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class basetest_amazon {
	
	  public static WebDriver driver;
	  public static Properties prop = new Properties();
	  public static Properties loc = new Properties();

			public static FileReader fr;
			public static FileReader fr1;

			@BeforeTest
			public void setup() throws IOException {
				
				
				if (driver==null) {
					 fr = new FileReader("C:\\Users\\Thirukkumaran\\git\\repository4\\maven1\\src\\test\\resources\\amazon\\amazon_config.properties");
					 fr1 = new FileReader("C:\\Users\\Thirukkumaran\\git\\repository4\\maven1\\src\\test\\resources\\amazon\\amazon_locators.properties");

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
					driver.close();
					System.out.println("teardown successfull");
					
				
	
	
	
	
	
	
	
			}
}
