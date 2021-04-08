package mq.corejava.OtherPackages;

import mq.corejava.instantmethods.NewChrome;
import mq.corejava.staticmethods.RobotB;

public class Run_publicMethods_From_Diff_package 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Calling Other package methods
		 * Rule1:-->
		 * 			Only public modifier method can access outside package
		 * Rule2:-->
		 * 			We should import otherpackage into Current runner class
		 * 			
		 * Syntax for import:-->
		 * 			 import packagename.*;
		 * 			 import packagename.classname;
		 * 
		 * Where should i write import:-->
		 * 			In runner class after packagename and before classname.
		 */
		
		//Object Creation for instant methods to call
		NewChrome obj=new NewChrome();
		obj.launch_browser();
		obj.Open_site();
		obj.Verify_page();
		
		//Calling Static Method using Class Name
		RobotB.method1();
		RobotB.method2();
		

		
		
		
		
	}

}
