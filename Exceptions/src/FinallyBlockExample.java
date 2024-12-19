/*
 * 		finally block
 * 		|
 * 		If any code if you want to execute in either cases
 * 			1. Exception 2. No Exception
 * 		then define that code inside finally block
 * 
 * 		try
 * 		{
 * 		}
 * 		catch ..
 * 		finally ...
 * 
 * 		try
 * 		{
 * 				
 * 		}
 * 		finally
 * 		{
 * 
 * 		}
 * 
 */
class Demo
{
	void open()
	{
		System.out.println("Opening Database Connection");
	}
	void close()
	{
		System.out.println("Closing Database Connection");
	}
	void operation ( int x )
	{
		try
		{
			open();
			int p = 10/x;			// database operation
			//close();				this will not work if their is exception
		}
		catch(Exception e)
		{
			//close()				this will not work if their is no exception
			System.out.println(e.getMessage());
		}
		finally
		{
			close();			// this will work in both cases
		}
	}
}

public class FinallyBlockExample {

	public static void main(String[] args) {
		
		Demo demo = new Demo();
		demo.operation(10);
	}
	
}
