package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class User_Actions {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://cleartrip.com");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);  //Static timeout to observe browser..
		
		//Select Radio button [Webdriver use click method to select radio button]
		driver.findElement(By.id("RoundTrip")).click();
		
		/*
		 * Select Suggesstion from [AutoComplete Editbox]
		 * 		Step1:--> Enter Referrence key name
		 * 		Step2:--> Wait until Suggesstion load to Source
		 * 		Step3:--> Select Suggesstion using click mehtod.
		 */
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("HYD");
		Thread.sleep(5000);	//managing timegap to load suggesstion t page source
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();

		//Selecting Suggesstion from auto complete editbox.
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("DEL");
		Thread.sleep(5000);  //managing timegap to load suggesstion t page source
		driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
		
		//Select Date From Datepicker [Calendar is auto populate on destination city]
		driver.findElement(By.linkText("22")).click();
		
		/*
		 * Select Date from Datepicker [Return date Calendar auto populate on Selection of DeparetuDate]
		 * Note:--> 
		 * 			If datepicker editbox is in readonly mode, We can type direct text 
		 * 			using sendkeys method.
		 */
		driver.findElement(By.id("ReturnDate")).clear();
		driver.findElement(By.id("ReturnDate")).sendKeys("Fri, 29 Oct, 2021"+Keys.ESCAPE);
		
		
		//Select adults dropdown option
		new Select(driver.findElement(By.id("Adults"))).selectByVisibleText("5");
		
	
		//select Checkbox [Webdriver use click method to select and deselect checkbox]
		driver.findElement(By.id("creditShell")).click();
		
		//Click button [Webdriver use click method to hit button]
		//driver.findElement(By.id("SearchBtn")).click();
		
		driver.findElement(By.id("SearchBtn")).submit();
	}

}
