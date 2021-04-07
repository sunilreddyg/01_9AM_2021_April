package mq.corejava.instantmethods;

public class RobotA 
{
	
	public RobotA() {
		System.out.println("Robot started");
	}

	void jump_high()
	{
		System.out.println("High jump");
	}
	
	void jump_Low()
	{
		System.out.println("Jump Low");
	}
	
	
	public static void main(String args[])
	{
		
		
		/*
		 * Classname obj=new Classname();
		 * obj.methodname();
		 */
		
		RobotA obj=new RobotA();
		obj.jump_high();
		obj.jump_Low();
		
	}
	
	
}
