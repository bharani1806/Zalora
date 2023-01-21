package zalora;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class zalora1 {

	public static void main(String[] args) throws InterruptedException {
	//	WebDriver driver = new ChromeDriver();
	//	driver.get("https://www.zalora.sg/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement login1 = driver.findElement(By.id("account__icon"));
		Actions ac = new Actions(driver);
		ac.moveToElement(login1).perform();
		
		//login
		
		driver.findElement(By.id("account-menu-login-btn")).click();
		driver.findElement(By.id("LoginForm_email")).sendKeys("bharani9a10a@gmail.com");
		driver.findElement(By.id("LoginForm_password")).sendKeys("12345bharani");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//search product
		
		driver.findElement(By.xpath("//input[@placeholder='Shop Superdry: comfort with style']"))
		.sendKeys("army pants for men");
		driver.findElement(By.xpath("//i[@class='icon_loupe-dark']")).click();
		Thread.sleep(4000);
		
		
		//check box
		driver.findElement(By.xpath("//span[@title='Casual']")).click();
		
		//product selection
        driver.findElement(By.xpath("//span[@class='brand-name']")).click();
        
        
        //close ads
        Thread.sleep(10000);
        driver.findElement(By.id("js-stickyNewsletter__close--btn")).click();
        Thread.sleep(5000);

        //add to cart
		WebElement addtocart = driver.findElement(By.id("AddToCart"));
		Actions ac1 = new Actions(driver);
		ac1.moveToElement(addtocart).perform();
		
		//select the size
		driver.findElement(By.xpath("//li[@data-value-class='opt-30-initem-0']")).click();
		
		//again check out
		driver.findElement(By.id("AddToCart")).click();
		
	    //main cart icon
		driver.findElement(By.id("minicart__icon")).click();
		
		// last check out
		driver.findElement(By.id("checkoutBtn")).click();
		
		//email & pwd for checkout
        Thread.sleep(3000);
		driver.findElement(By.id("CheckEmailForm_email")).sendKeys("bharani9a10a@gmail.com");
		driver.findElement(By.xpath("//button[@title='Continue']")).click();
        Thread.sleep(3000);
		driver.findElement(By.id("LoginForm_password")).sendKeys("12345bharani");
		driver.findElement(By.xpath("//button[@title='Sign in']")).click();
		
		//final 
        Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='Continue']")).click();
		
		


	}

}
