package selenium_webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editbox_Syntax {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		/*
		 * Note:--> Clear method only use for Editoxes to clear
		 * 			existing text and allow user to type new text.
		 */
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("Newuser");
		
		/*
		 * Note:-->
		 * 			Sendkeys is a method it allow characters to type into editbox.
		 * 			And also usefull to pass keyboard shortcuts on selected location
		 */
		driver.findElement(By.name("firstname"))
		.sendKeys(Keys.TAB+"Webdriver"
				+Keys.TAB+"newuserwebdriver@gmail.com");
		
		
		driver.findElement(By.id("month"))
		.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);

	}

}
