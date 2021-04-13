package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Script 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys("darshan123@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("hello12345");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
	
		/*
		 * Exceptions:-->
		 * 	=>  WebDriver driver=new ChromeDriver();
		 * 		
		 * 		IllegalStateException:-->
		 * 			When Chromdriver.exe file not located
		 * 			under current system.
		 * 
		 * 	=> driver.get("http://google.com");
		 * 		
		 * 		SessionNotCreated:-->
		 * 			Exception display when browserdriver
		 * 			version mismatch with browser version.
		 * 
		 * 		InvalidArgumentException:-->
		 * 			When Url defined without http:// or https://
		 * 	
		 * 			Invalid:-->    driver.get("www.google.com");
		 * 			Valid:---->	   driver.get("http://google.com");
		 */
		

	}

}
