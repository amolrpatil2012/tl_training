
// An interface can extends to another interface
// An interface can extends to more than one interfaces --> Multiple Inheritance is allowed
interface A
{
	void show();
	void xyz();
}
interface B
{
	void display();
	void xyz();
}
interface C extends A,B
{
	int add ( int x , int y);
}

class Demo implements C
{

	@Override
	public void show() {		
		System.out.println("Inside show method");
	}

	@Override
	public void display() {
		System.out.println("Inside display method");		
	}

	@Override
	public int add(int x, int y) {
		return x+y;
	}

	@Override			// method for interface A and interface B
	public void xyz() {		
		System.out.println("Inside xyz method");
		
	}
	
}

public class InterfacePropetiesExample {
	
	public static void main(String[] args) {
		
		
		C t = new Demo();
		t.show();
		t.display();
		System.out.println("Add : " + t.add(10, 20));
		
		
	}

}
