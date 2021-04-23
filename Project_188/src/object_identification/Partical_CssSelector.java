package objectIdentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partical_CssSelector {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://register.rediff.com/");
		
		driver.findElement(By.cssSelector("a[title*='Rediffmail']")).click();
		
		
		driver.findElement(By.cssSelector("input[name*='name']")).clear();
		driver.findElement(By.cssSelector("input[name*='name']")).sendKeys("Newuser");

	}

}
