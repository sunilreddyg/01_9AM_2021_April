package browser_launch_commands;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launch_IE_Browser {

	public static void main(String[] args) 
	{
		
		/*
		 * Navigation to downlaod IEDriverServer.exe file
		 * 		=> visit selenium offical site http://selenium.dev/downloads
		 * 		=> IEDriverServer version shoudl match with WebDriver Version
		 * 		=> Under The InternetExplorer driver download 
		 * 				zip format file
		 * 		=> Unzip file to back up folder
		 * 		=> Set runtime environment variable before launch IE browser
		 * 
		 * 		Additional settings:-->
		 * 		=> Disable all privacy and Security settings
		 * 				Nav:-- Open IE browser ---> tools  ---> InternetOptions
		 * 							---> Select privacy & Security
		 * 		=> Support only IE 11 version
		 * 		=> Zoom level should be 100%
		 */
		
		//Setting Runtime environment variable to locate IEDriverServer
		System.setProperty("webdriver.ie.driver", "Drivers\\IEDriverServer.exe");
		
		//Command Luach IE automation browser
		InternetExplorerDriver ie=new InternetExplorerDriver();
		
		//Load new page into ie browser window
		ie.get("http://facebook.com");
		
		//print title of current page
		System.out.println(ie.getTitle());
		
		//Close automation browser window..
		ie.close();

	}

}
