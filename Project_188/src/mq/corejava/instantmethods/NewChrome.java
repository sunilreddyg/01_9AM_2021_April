package mq.corejava.instantmethods;


public class NewChrome 
{
	
	void launch_browser()
	{
		System.out.println("Browser launched");
	}
	
	void Open_site()
	{
		System.out.println("Site opened");
	}
	
	void Verify_page()
	{
		System.out.println("PageVerified");
	}
	
	void Testpage()
	{
		launch_browser();
		Open_site();
		Verify_page();
	}
	
	public static void main(String[] args) 
	{
		/*
		 * Calling Instant methods from different same class
		 * 	ClassName obj=new ClassName();
		 * 	obj.methodname();
		 */
		
		
		NewChrome obj=new NewChrome();
		obj.Testpage();
		
	}

}
