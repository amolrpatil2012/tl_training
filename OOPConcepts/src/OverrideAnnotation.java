
class A
{
	void show()
	{
		System.out.println("Inside class A Show Method");
	}
}

class B extends A
{
	@Override			// not compulsory
	void show()			// use it to make sure that overriding method is correct
	{
		System.out.println("Inside class B Show Method");
	}
}

public class OverrideAnnotation {
	
	public static void main(String[] args) {
		
		A t ;
		
		t = new B();
		t.show();
		
		
	}

}
