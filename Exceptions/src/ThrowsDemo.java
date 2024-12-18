/*
 * 		public static void show ( int x )throws Exception
 * 		|
 * 		It is compulsory to call show method in a try block
 * 		otherwise compiler will give an error
 * 
 */

import java.util.Scanner;

public class ThrowsDemo {

	// show throws Exception
	public static void show ( int x )throws Exception
	{		
		if(x==0)
			throw new Exception("Zero Not Allowed");
		
		System.out.println("Inside show Method");	
		int y = 10 / x ;
		System.out.println("Result : " + y);	
		
	}
	public static void display(int x)throws Exception
	{
		System.out.println("Inside Display method");
		show(x);
		
//		try
//		{
//			show(x);
//		}
//		catch(Exception e)
//		{
//			System.out.println(e.getMessage());
//		}
	}
	//public static void main(String[] args)throws Exception {
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Any No");
		int x = scanner.nextInt();
//		display(x);
		
		try
		{
			display(x);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
