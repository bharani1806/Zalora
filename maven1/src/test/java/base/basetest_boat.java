package base;

import org.openqa.selenium.By;

public class basetest_boat {
	//search_box
			driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("wired headphones");
			
			Thread.sleep(4000);
			
			//product_select1
			driver.findElement(By.xpath("//img[@src='https://cdn.shopify.com/s/files/1/0057/8938/4802/products/c3d0fbbd-9479-4351-bf04-91136da2ae91_large.png?v=1656750183']")).click();
			Thread.sleep(2000);

			//addtocart1
			driver.findElement(By.xpath("//*[@id=\"AddToCart\"]/span[1]")).click();
			
			//continueshop
			Thread.sleep(4000);

			driver.findElement(By.xpath("//button[@data-action='close' and @class=' tap-area' ]")).click();
			
			//back
			driver.navigate().back();
		
			//search_box
			driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("Airpods");
			
			
			Thread.sleep(4000);

			//product_select2
			driver.findElement(By.xpath("//img[@src='https://cdn.shopify.com/s/files/1/0057/8938/4802/products/back_large.png?v=1668599490']")).click();

			//https://cdn.shopify.com/s/files/1/0057/8938/4802/products/back_large.png?v=1668599490

			//addtocart1
			driver.findElement(By.xpath("//*[@id=\"AddToCart\"]/span[1]")).click();
			
			Thread.sleep(4000);
			//continueshop
			driver.findElement(By.xpath("//button[@data-action='close' and @class=' tap-area' ]")).click();
			
			//back
			driver.navigate().back();
			

}
