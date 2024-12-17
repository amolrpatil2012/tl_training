/*
 * 		A class can implement any no interfaces -- Multiple Inheritance
 * 
 * 		class X extends Y,Z			// This will not work
 * 
 * 		class X implements Y,Z 		// class can implements Y,Z
 * 
 * 		class X extends P implements Y,Z
 * 
 */

interface Add
{
	int add ( int x , int y);
}
interface Sub
{
	int sub ( int x ,int y);
}

class Display
{
	public void show()
	{
		System.out.println("Inside Display class");
	}
}
class Calc extends Display implements Add,Sub
{

	@Override
	public int sub(int x, int y) {
		return x-y;
	}

	@Override
	public int add(int x, int y) {
		return x+y;
	}
	
}


public class MultipleInterfaceExample {
	public static void main(String[] args) {
		
		Calc calc = new Calc();
		System.out.println(calc.add(10,20));
		System.out.println(calc.sub(20, 10));
		calc.show();
		
	}

}
