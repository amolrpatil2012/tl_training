@FunctionalInterface
interface Demo
{	
	void show();
}
@FunctionalInterface
interface MultipleStatementInterface
{
	void show();
}
@FunctionalInterface
interface ParameterInterface
{
	void add ( int x , int y);
}
@FunctionalInterface
interface ParameterReturnInterface
{
	int add ( int x , int y);
}
public class LambdaExpressionExample {

	public static void main(String[] args) {
		
		/*	Implementation of an Functional Interface using Anonymous class
		 
		Demo d = new Demo() {			
			@Override
			public void show() {
				System.out.println("Hello World");
			}
		};		
		d.show();
		
		*/
		// Implementation of a Functional Interface using Lambda Expression [ anonymous class , anonymous method ]
		
		Demo d = ()->System.out.println("Hello World");		// single statement
		d.show();
		
		MultipleStatementInterface t = ()->{				// multiple statements
			System.out.println("This is First Statement");
			System.out.println("This is Second Statement");
		};
		t.show();
		
		ParameterInterface p = (x,y)->System.out.println(x+y);	// parameters
		p.add(30, 40);
		
		ParameterReturnInterface r = (x,y)->x+y;		// return x+y parameters+return
		System.out.println(r.add(30, 40));
		
	}
}
