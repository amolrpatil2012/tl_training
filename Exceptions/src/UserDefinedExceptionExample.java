
// User defined Exception 
class AgeException extends Exception
{
	public AgeException ( String message )
	{
		super(message);
	}
}

class Emp
{
	private int age;
	private String name;
	
	public Emp ( int age , String name)
	{
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	
	
	
}
public class UserDefinedExceptionExample {

	/*
	 * 		Their is possibility of AgeException from enter method
	 * 
	 * 		public static void enter ( Emp s)throws AgeException
	 * 		|
	 * 		We need to call enter method inside try-catch block
	 * 		or otherwise compiler will give an error
	 * 
	 */
	public static void enter ( Emp s)throws AgeException
	{
			if ( s.getAge() < 18)
				throw new AgeException("Age is Not Valid");
			else 
				System.out.println("Welcome : " + s.getName());
	}
	
	public static void main(String[] args) {
		
		try
		{
			Emp s1= new Emp(23, "Ramesh");
			enter(s1);									// No Exception
		
			Emp s2 = new Emp(15,"Suresh");
			enter(s2);									// Will get AgeException	
		}
		catch(AgeException e)
		{
			System.out.println( e.getMessage());
		}
		
		
		
	}
	
}
