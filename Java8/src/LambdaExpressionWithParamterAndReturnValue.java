
@FunctionalInterface
interface Circle
{
	double area ( double radius);
}

public class LambdaExpressionWithParamterAndReturnValue {

	public static void main(String[] args) {
		
		Circle t = (radius) -> 3.14 * radius *radius;		
		System.out.println( t.area(100));	
		
		Circle t1 = (r)->{			
			double pi = 3.14;
			return pi*r*r;
		};
		System.out.println(t1.area(100));
		
	}
}
