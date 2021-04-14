package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Dropdown_Options {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		new Select(driver.findElement(By.id("customState")))
		.selectByVisibleText("Telangana");
		Thread.sleep(5000);  //Static timegap to load cities releated to selected state
		
		new Select(driver.findElement(By.id("customCity")))
		.selectByValue("hyderabad");
		Thread.sleep(1000);
		
		//Type text into editbox
		driver.findElement(By.id("customLocality")).clear();
		driver.findElement(By.id("customLocality")).sendKeys("Gandhi nagar");
		
		//Select dropdown using index number
		new Select(driver.findElement(By.id("customRadius"))).selectByIndex(4);
		
		
		//Select chekcbox[In Webdriver inorder to select / deselect checkbox we follow method click();]
		driver.findElement(By.id("amenity_category_order_types50")).click();
		
		//Click Button
		driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div[1]/div[1]/form[2]/ul/li[7]/input")).click();
		
		
		
	}

}
