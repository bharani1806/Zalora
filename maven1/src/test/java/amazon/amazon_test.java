package amazon;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import base.basetest_amazon;

public class amazon_test extends basetest_amazon {

	@Test
	public static void main() throws InterruptedException, IOException {

		driver.manage().window().maximize();

		
		//signin
		driver.findElement(By.id(loc.getProperty("signin"))).click();
		
		
		Thread.sleep(2000);
		
		//email
		driver.findElement(By.id(loc.getProperty("email"))).sendKeys("bharani9a10a@gmail.com"); 
		
		//continue
		driver.findElement(By.id(loc.getProperty("continue"))).click();
		
		//password
		driver.findElement(By.id(loc.getProperty("password"))).sendKeys("123456bharani");
		
		//signin_btn
		driver.findElement(By.id(loc.getProperty("signin_btn"))).click();
		
		Thread.sleep(10000);

		
		//scroll
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Thread.sleep(1000);

		//aboutus
		driver.findElement(By.xpath(loc.getProperty("aboutus"))).click();
		
		//screenshot
		Thread.sleep(10000);
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Thirukkumaran\\OneDrive\\Desktop\\java\\screenshot eclipse\\ss1.png");
		FileUtils.copyFile(source, dest);
		
		driver.navigate().back();
		
		//amazon_homebtn
		driver.findElement(By.id(loc.getProperty("amazon_homebtn"))).click();
			
		//search_product
		driver.findElement(By.id(loc.getProperty("search_product"))).sendKeys("samsung m53");
		
		//search_icon
		driver.findElement(By.xpath(loc.getProperty("search_icon"))).click();
		
		//product_selection
		driver.findElement(By.xpath(loc.getProperty("product_selection"))).click();
		
		//buy_now
		driver.findElement(By.id(loc.getProperty("buy_now"))).click();
		
		
		
		
		
	}

}
