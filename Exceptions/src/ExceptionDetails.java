/*
 * 		try with multiple catch
 * 
 * 		try
 * 		{
 * 
 * 		}
 * 		catch ( exception 1)
 * 		{
 * 		}
 * 		catch(exception 2)
 * 		{
 * 		}
 * 
 * 		Exception is a super class of all exception related classes
 * 
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDetails {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Any No");
		int p[] = new int[10];
		
			try
			{
				int x = scanner.nextInt();			// new InputMismatchException();
				int y = 10 / x ;					// new ArithmeticException();					
				System.out.println("Result : " + y);
				p[x] = 67;							// new ArrayIndexOutOfBoundsException();
				System.out.println(p[x]);
			}			
			catch(ArithmeticException e)
			{
					System.out.println(e.getMessage());
			}
			catch(InputMismatchException e)
			{
				System.out.println("Expected Input is Numerical");
			}
			catch(Exception e)			
			{
				System.out.println(e.getMessage());
			}
		 System.out.println("Application Ends");
	}

}
