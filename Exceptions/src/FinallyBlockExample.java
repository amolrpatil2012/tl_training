
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
			close();
		}
	}
}

public class FinallyBlockExample {

	public static void main(String[] args) {
		
		Demo demo = new Demo();
		demo.operation(10);
	}
	
}
