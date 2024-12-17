
class P
{
	public void display()
	{
		System.out.println("Inside class P");
	}
}
class Q extends P
{
	@Override
	public void display()
	{
		System.out.println("Inside class Q");
	}
}
class R extends P
{
	@Override
	public void display()
	{
		System.out.println("Inside class R");
	}
}
public class InstanceOfDemo {

	public static void show ( P obj )
	{
		if ( obj instanceof Q)		// will check if obj is referring to object of class Q
		{
			System.out.println("This is an instance of Q");
			obj.display();
		}
	}
	
	public static void main(String[] args) {
		
		show ( new Q());
		show( new R());
		
		
	}
	
}
