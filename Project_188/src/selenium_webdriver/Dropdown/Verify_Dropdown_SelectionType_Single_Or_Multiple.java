package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_SelectionType_Single_Or_Multiple 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		

		boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Dropdown is multipel selection type -->"+flag);
		
		
		((JavascriptExecutor)driver)
		.executeScript("document.getElementById('customState').setAttribute('multiple','multiple')");
		Thread.sleep(4000);
		
		
		boolean flag1=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Dropdown is multipel selection type -->"+flag1);
		
		
		System.out.println("Statement1");
		System.out.println("Statement2");
		
		
		System.out.println("Statement3");
		System.out.println("Statement4");
		System.out.println("Statement5");
		

	}

}
