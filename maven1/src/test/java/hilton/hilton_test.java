package hilton;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import base.basetest_hilton;

public class hilton_test extends basetest_hilton {

	@Test
	public static void main() throws InterruptedException, IOException {

		
		Thread.sleep(4000);

		driver.manage().window().maximize();
		
		Thread.sleep(4000);

		//type_location
		driver.findElement(By.xpath(loc.getProperty("type_location"))).sendKeys("chennai");
		
		Thread.sleep(4000);
		//select_location
		driver.findElement(By.xpath(loc.getProperty("select_location"))).click();
		
		//select_dates
		driver.findElement(By.xpath(loc.getProperty("select_dates"))).click();
		
		
		Thread.sleep(3000);

		//next_month
		driver.findElement(By.xpath(loc.getProperty("next_month"))).click();
		
		Thread.sleep(2000);

		
		//start_date
		driver.findElement(By.id(loc.getProperty("start_date"))).click();
		Thread.sleep(2000);

		//end_date
		driver.findElement(By.id(loc.getProperty("end_date"))).click();
		
		//close_x1
		driver.findElement(By.xpath(loc.getProperty("close_x1"))).click();
		
		//no_of_guest_btn
		driver.findElement(By.xpath(loc.getProperty("no_of_guest_btn"))).click();
		
		//add_adult
		driver.findElement(By.xpath(loc.getProperty("add_adult"))).click();
		
		//close_x2
		driver.findElement(By.xpath(loc.getProperty("close_x2"))).click();

		//find_hotel
		driver.findElement(By.xpath(loc.getProperty("find_hotel"))).click();
		
		Thread.sleep(4000);

		//select_hotel
		driver.findElement(By.xpath(loc.getProperty("select_hotel"))).click();
		
		Thread.sleep(4000);

		Set<String> handles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(handles);
		
		driver.switchTo().window(list.get(1));
		
		
		Thread.sleep(4000);
		//select_room_type
		driver.findElement(By.xpath(loc.getProperty("select_room_type"))).click();
		
		Thread.sleep(2000);
		//accept_room_type
		driver.findElement(By.xpath(loc.getProperty("accept_room_type"))).click();
		
		Thread.sleep(4000);

		//hotel_details
		driver.findElement(By.xpath(loc.getProperty("hotel_details"))).click();
		
		Thread.sleep(10000);
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Thirukkumaran\\OneDrive\\Desktop\\java\\screenshot eclipse\\ss2.png");
		FileUtils.copyFile(source, dest);
		
		Thread.sleep(4000);
		//close_x3
		driver.findElement(By.xpath(loc.getProperty("close_x3"))).click();
		
		Thread.sleep(2000);
		//final_rate
		driver.findElement(By.xpath(loc.getProperty("final_rate"))).click();
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
