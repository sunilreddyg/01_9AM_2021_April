package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Expected_Option_count_Available_At_Dropdown 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Step1:--> Launch Browser
		 * Step2:--> Load Cleartrip website
		 * Step3:--> Maximize browser window  [Optional]
		 * Step4:--> Select Adults dropdown optins Maximum 9
		 * Step5:--> Verify Child Dropdown option should not display any number
		 */
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://cleartrip.com");
		driver.manage().window().maximize();
		
		//Selecting Maximum 9 options at adult dropdown
		Select Adults_Selector=new Select(driver.findElement(By.id("Adults")));
		Adults_Selector.selectByIndex(7);
		Thread.sleep(4000);
		
		//Get selected option populated[Gettext method capture text at location]
		System.out.println("Adult Option selected is---> "+Adults_Selector.getFirstSelectedOption().getText());
		
		//Geta total option count available at dropdown
		int Childrens_count=new Select(driver.findElement(By.id("Childrens"))).getOptions().size();
		
		//Decision to verify option count at dropdown
		if(Childrens_count > 2)
		{
			System.out.println("Testfail");
		}
		else
		{
			System.out.println("Testpass");
		}
		
		
		
		
		
		

	}

}
