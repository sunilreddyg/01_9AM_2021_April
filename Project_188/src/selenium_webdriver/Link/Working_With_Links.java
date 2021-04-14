package selenium_webdriver.Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Links 
{

	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Pages")).click();
		driver.findElement(By.linkText("Cristiano Ronaldo")).click();
		Thread.sleep(4000);
		
		driver.get("http://cleartrip.com");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("View travel")).click();
		
		
	}

}
