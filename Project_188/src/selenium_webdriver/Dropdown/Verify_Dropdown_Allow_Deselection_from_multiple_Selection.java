package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Allow_Deselection_from_multiple_Selection {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		/*
		 * Converting single selection dropdown to multiple selection dropdown
		 * using javascript...
		 * 
		 * Note:--> This syntax is only for example. 
		 */
		((JavascriptExecutor)driver)
		.executeScript("document.getElementById('customState').setAttribute('multiple','multiple')");
		Thread.sleep(4000);
		
		//Verify Dropdown Selection type is single or multple..
		boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Dropdown is multipel selection type -->"+flag);
		
		//Writing decison statament to accept only in dropdown is multiple selection type
		if(flag)
		{
			System.out.println("Dropdoww is multiple selection type");
			
			//Select Multiple Options
			Select State_Selector=new Select(driver.findElement(By.id("customState")));
			State_Selector.deselectAll();   //Use deselect commands only if dropdown is multiple selection type
			State_Selector.selectByIndex(2);
			State_Selector.selectByIndex(4);
			State_Selector.selectByIndex(6);
			Thread.sleep(4000);
			
				//Get Selection Count before Deselcting
				int SCount=State_Selector.getAllSelectedOptions().size();
				//Verify Selection Equal to 3
				if(SCount==3)
				{
					System.out.println("As Expected maximum 3 options selected");
					//Deselect Single option from selection
					State_Selector.deselectByIndex(4);
					
						//Get Selection Count after deselecting one option
						int Dcount=State_Selector.getAllSelectedOptions().size();
						if(Dcount ==2)
						{
							System.out.println("Testpass, As expected User able to deselect option from multiple selection");
						}
						else
						{
							System.err.println("Tesfail, User not able to deselect single option from multiple selection");
						}
				}
				else
				{
					System.err.println("Condition failed 3 options not selected");
				}
				
			
		}
		else
		{
			System.err.println("Dropdown is not multiple selection type");
		}
		

	}

}
