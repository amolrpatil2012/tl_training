// We can pass lambda expression as a argument to another method

@FunctionalInterface
interface AddCalculator
{
	int add(int x, int b);
}
public class LamdaExpressionAsArgument {

	public static void calcMethod ( AddCalculator calc) // AddCalculator calc =(x,y)->x+y
	{
		System.out.println(calc.add(30, 40));
	}
	
	public static void main(String[] args) {
		
//		AddCalculator t = (x,y) -> x+y;			// t = (x,y)->x+y
//		calcMethod(t);							// calcMethod ( (x,y) -> x+y )
	
		calcMethod ( (x,y)->x+y );
		
		
		
	}
}
