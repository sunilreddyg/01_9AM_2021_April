package mq.corejava.methods_otherthan_void;

public class Product 
{
	
	
	void AddProduct(String productname)
	{
		System.out.println(productname);
		String name="MQ";
	}
	
	String getProduct()
	{
		return "Iphone";
	}
	

	public static void main(String[] args) 
	{
		Product obj=new Product();
		obj.AddProduct("Samsung");
		
		//Calling otherthan void method
		String phone=obj.getProduct();
		System.out.println(phone);
		
		

	}

}
