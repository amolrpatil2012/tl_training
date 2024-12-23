class AgeException extends Exception
{
	public AgeException(String msg)
	{
		super(msg);
	}
}

public class ThrowAndThrows {

	// throws keyword - makes it compulsory to call checkAge in try-catch
	static void checkAge ( int age )throws AgeException
	{
		if(age<18)
		{
			// throw - used to throw an exception from program
			throw new AgeException("Age < 18 Not Allowed");
		}
		else
			System.out.println("Welcome");
		
	}
	
	static void display ( int age )throws AgeException
	{
		checkAge(age);
	}
	public static void main(String[] args) {
		
		try
		{
			display(14);
		}
		catch(AgeException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
}
