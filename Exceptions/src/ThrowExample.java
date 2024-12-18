/*
 * 		throw keyword
 * 		|
 * 		Used to throw exception
 * 
 * 		Exceptions are always propagates from called function
 * 		to caller function
 * 		e.g. from show to display and from display to main 
 * 
 */

import java.util.Scanner;

public class ThrowExample {

	public static void show ( int x )
	{
		System.out.println("Inside show Method");
		try
		{
			int y = 10 / x ;
			System.out.println("Result : " + y);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Problem in show method");
			throw e;		// re throwing exception
		}
		
	}
	public static void display(int x)
	{
		System.out.println("Inside Display method");
		show(x);
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Any No");
		int x = scanner.nextInt();
		display(x);
		
	}
}
