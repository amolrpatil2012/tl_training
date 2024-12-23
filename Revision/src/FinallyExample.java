import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * 	Whenever exception takes place
 * 		catch block is working
 * 
 *  When no exception
 *  	try block is working
 *  
 *  finally block
 *  	|
 *  	will get execute in every scenario 
 *  			exception or no exception
 */

public class FinallyExample {
	
	public static void main(String[] args) throws IOException {
		FileOutputStream fout = null;
		try
		{
			 	fout	= 
					new FileOutputStream("d:/xyz/demo.txt" , true);	// true - append mode
		
			System.out.println("Connected to file");
			
			Scanner scanner = new Scanner(System.in);
			int x = scanner.nextInt();
			int y = 10/x;
			System.out.println("y" + y);
		
			String s = "\n This is new Message";
			byte b[] = s.getBytes();		
			fout.write(b);
		
			
		}
		catch(Exception e)
		{
			
			System.out.println(" Their is an Error in Program");
		}
		
		finally
		{
			System.out.println("Closing Connection");
			fout.close();
		}
	}

}
