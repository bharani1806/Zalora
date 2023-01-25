package boat_package;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;

public class boat_test {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.boat-lifestyle.com/");
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scroll(0,document.body.scrollHeight)");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[text()='Return Policy']")).click();
		TakesScreenshot;
		
		
		
			
		
		
				
	
	}

}
