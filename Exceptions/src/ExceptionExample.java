/*
 * 	Exception is an event [ abrupt termination ] of an Application due to RuntimeError
 * 
 * 	Possibilities :		Divide By Zero		10/0
 * 						Index Out Of range	a[11]
 * 						Connection errors	database.open()
 * 
 * 	Every possible runtime error is represented by predefined class
 * 
 * 		10/0			ArithmeticException
 * 		a[11]			ArrayIndexOutOfBoundsException
 * 		...
 * 
 * 	What happened when exception takes place ?
 * 			
 * 		1. if x == 0 then JVM create an Object of ArithmeticException and thrown
 * 
 * 			int y = 10 / x ;  -> throw new ArithmeticException();
 * 
 * 		2. JVM will check if any exception handling mechanism is available
 * 		
 * 			it will check is there any variable available to catch thrown exception
 * 
 * 		3. If it is available then it works accordingly
 * 		4. If not JVM terminate application by printing 
 * 		   all details of an Exception [ stack trace of an exception ]
 * 
 * 	How to handle Exception ?
 * 
 * 		try
 * 		{
 * 				All the statements which may throw an Exception
 * 			
 * 		}
 * 		catch( exception variable )
 * 		{
 * 				Handle Exception / Give Proper Message
 * 				
 * 
 * 		}
 * 						
 */


import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Any No");
		int x = scanner.nextInt();
			try
			{
				int y = 10 / x ;						// throw new AE();
				System.out.println("Result : " + y);			
			}
			catch(ArithmeticException e)
			{
					System.out.println(e.getMessage());
			}
		
		 System.out.println("Application Ends");
		
	}
}
