@FunctionalInterface
interface AddCalculator
{
	int add(int x, int b);
}
public class LamdaExpressionAsArgument {

	public static void calcMethod ( AddCalculator calc)
	{
		System.out.println(calc.add(30, 40));
	}
	
	public static void main(String[] args) {
		
		AddCalculator t = (x,y) -> x+y;
		calcMethod(t);
		
		
		
	}
}
