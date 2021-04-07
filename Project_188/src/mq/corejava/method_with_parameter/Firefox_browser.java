package mq.corejava.method_with_parameter;

public class Firefox_browser 
{
	
	//Method with fuctional parameter
	void siteopen(String url)
	{
		System.out.println(url);
		
	}
	
	void type_userDetails(String username,String password)
	{
		System.out.println(username);
		System.out.println(password);
	}
	

	public static void main(String[] args) 
	{
		Firefox_browser obj=new Firefox_browser();
		
		//callling method with actual parameter
		obj.siteopen("http://facebook.com/v1.0");
		obj.siteopen("http://facebook.com/v2.0");
		obj.siteopen("http://google.com");
		
		//Calling method with multiple parameters
		obj.type_userDetails("sunil", "S1234");
		obj.type_userDetails("Harish", "H2asd234");

	}

}
