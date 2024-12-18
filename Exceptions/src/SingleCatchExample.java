/*
 * 		try with single catch block with Exception variable
 * 
 * 		try
 * 		{
 * 
 * 		}
 * 		catch(Exception e)
 * 		{
 * 		}
 * 
 */
import java.util.Scanner;

public class SingleCatchExample {
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
			catch(Exception e)			
			{
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		 System.out.println("Application Ends");
	}

}
