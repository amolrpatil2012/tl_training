

/*
 * 	Java 9
 * 
 * 		Default Method
 * 		|
 * 		We can define method with definition inside an interface
 * 
 * 		Private Method [ rarely used ]
 * 		|
 * 		We can define some common code required for default methods
 * 		inside private method
 * 
 * 		Static Method
 * 		|
 * 		Writing static method in a class and in a interface have same
 * 		meaning
 * 		
 * 
 */

interface DemoInterface
{
	default void show()
	{
		privateMethod();
		System.out.println("Inside Show Method");
	}
	default void defaultMethod()
	{
		privateMethod();
		System.out.println("Inside Default Method");
	
	}
	
	private void privateMethod()
	{
		System.out.println("Inside private method");
	}
	
	static void staticMethod()
	{
		System.out.println("Inside Static Method");
	}
	
	void display();
}

class DemoImpl implements DemoInterface
{

	@Override
	public void display() {
			System.out.println("Inside Display Method");		
	}
	
//	@Override
//	public void show()
//	{
//		System.out.println("Inside show method in class");
//	}
	
}

public class InterfaceNewProperties {
	
	public static void main(String[] args) {
		
		DemoInterface d = new DemoImpl();
		d.show();
		d.display();
		
		DemoInterface.staticMethod();
		
	}

}
