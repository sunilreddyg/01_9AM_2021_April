package mq.corejava.staticmethods;

public class RobotB 
{
	

	public RobotB()
	{
		System.out.println("Initiated");
	}

	public static void method1()
	{
		System.out.println("method1 executed");
	}
	
	public static void method2()
	{
		System.out.println("method2 executed");
	}
	


	public static void main(String[] args) 
	{
		/*
		 * Calling static method from mainmehtod with in Same class
		 * Note:--> No need of classname to call methods..
		 */
		method1();
		method2();
	}

}
