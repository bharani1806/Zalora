package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.basetest;

public class zaloratest extends basetest {
	
	
	@Test
	public static void logintest() throws InterruptedException
	{
		Thread.sleep(5000);
	driver.manage().window().maximize();
	
	
	//login_hover
	WebElement login1 = driver.findElement(By.id(loc.getProperty("login_hover")));
	Actions ac = new Actions(driver);
	ac.moveToElement(login1).perform();
	
	//login_click
	driver.findElement(By.id(loc.getProperty("login_click"))).click();
	
	//login_email
    driver.findElement(By.id(loc.getProperty("login_email"))).sendKeys("bharani9a10a@gmail.com");
	
	//login_pwd
	driver.findElement(By.id(loc.getProperty("login_pwd"))).sendKeys("12345bharani");
	
	//login_nxt_button
	driver.findElement(By.xpath(loc.getProperty("login_nxt_button"))).click();
	
	
	//search_productbox
	driver.findElement(By.name(loc.getProperty("search_productbox")))
	.sendKeys("army pants for men");
	
	//search_icon
	driver.findElement(By.xpath(loc.getProperty("search_icon"))).click();
	Thread.sleep(4000);
	
	
	//check_box
	driver.findElement(By.xpath(loc.getProperty("check_box"))).click();
	
	//product_selection
    driver.findElement(By.xpath(loc.getProperty("product_selection"))).click();
    
    
    //close_ads
    Thread.sleep(10000);
    driver.findElement(By.id(loc.getProperty("close_ads"))).click();
    Thread.sleep(5000);

    //add to cart
	//WebElement addtocart = driver.findElement(By.id("AddToCart"));
	//Actions ac1 = new Actions(driver);
	//ac1.moveToElement(addtocart).perform();
    
    //add_to_cart
	driver.findElement(By.id(loc.getProperty("add_to_cart"))).click();

	
	//select_size
	//driver.findElement(By.xpath(loc.getProperty("select_size"))).click();
	
	//add_to_cart
	//driver.findElement(By.id(loc.getProperty("add_to_cart"))).click();
	
    //checkout_icon
	driver.findElement(By.id(loc.getProperty("checkout_icon"))).click();
	
	//last_checkout
	driver.findElement(By.id(loc.getProperty("last_checkout"))).click();
    Thread.sleep(3000);
    
    //checkout_email
	driver.findElement(By.id(loc.getProperty("checkout_email"))).sendKeys("bharani9a10a@gmail.com");
	
	//checkout_continue_btn
	driver.findElement(By.xpath(loc.getProperty("checkout_continue_btn"))).click();
    Thread.sleep(3000);
    
    //checkout_pwd
	driver.findElement(By.id(loc.getProperty("checkout_pwd"))).sendKeys("12345bharani");
	
	//checkout_signin
	driver.findElement(By.xpath(loc.getProperty("checkout_signin"))).click();
	
	//checkout_continue_btn 
    Thread.sleep(2000);
	driver.findElement(By.xpath(loc.getProperty("checkout_continue_btn"))).click();
	}
	

}
