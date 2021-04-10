package browser_launch_commands;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox_Browser 
{

	public static void main(String[] args)
	{

		/*
		 * Navigation to download geckodriver.exe file
		 * 
		 * 		Step1:--> https://firefox-source-docs.mozilla.org/testing/geckodriver/Support.html
		 * 		Step2:--> Findout Installed firefox browser version
		 * 					Nav:--> Settings---> Help ---> About Firefox
		 * 		Step3:-->  Findout related geckodriver version w.r.t firefox
		 * 						browser and Selenium version
		 * 		Step4:-->  Click on geckodriver releases link
		 * 		Step5:-->  At geckodriver release page under Assets
		 * 					downlaod zip format file for windows w.r.t Hotspot size
		 * 		Step6:--> Once Downloaded unzip file to backup folder
		 * 		Step7:--> Set Environment variable before launch firefox browser..
		 */
		
		//Set runtime environment variable for geckodriver
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
	
		//This line of command launc firefox browser and store browser int firefoxDriver class
		FirefoxDriver firefox=new FirefoxDriver();
		//This line of command open website at automation browser window
		firefox.get("https://google.com");
		
		//this line of command print current title name at google page
		System.out.println(firefox.getTitle());
		
		//This line of command close browser
		firefox.close();
		
		
		

	}

}
