
/*
 * In static/compile time Polymorphism
 * Compiler knows which function we are calling
 * That's why it is known as Early Binding / compile time polymorphism
 * 
 */
public class EarlyBindingDemo {

	// Function Overloading
	public static int add ( int x , int y)
	{
		return x+y;
	}
	public static String add ( String x , String y)
	{
		return x+y;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println( " Add Method with int : " + add(20,30));
		System.out.println( " Add Method with String : " + add("Hello","World"));
	}
}
