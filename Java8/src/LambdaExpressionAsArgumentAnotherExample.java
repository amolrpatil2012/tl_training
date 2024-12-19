@FunctionalInterface
interface Shape
{
	double area ( double d1 , double d2);
}

class Rect implements Shape
{
	@Override
	public double area(double d1, double d2) {
		return d1*d2;
	}
	
}
class Triangle implements Shape
{
	@Override
	public double area(double d1, double d2) {
		return 0.5*d1*d2;
	}
	
}

class LambdaExpressionAsArgumentAnotherExample
{
	// variable of Shape means object of class which implements Shape interface
	public static void calculateArea( Shape s )
	{
		System.out.println("Area = " + s.area(20, 20));
	}
	
	public static void main(String[] args) {
		
//		Shape s = new Rect();
//		System.out.println("Area = " + s.area(10, 20));
//		
//		s = new Triangle();
//		System.out.println("Area = " + s.area(20, 20));
				
//		calculateArea( new Rect() );
//		calculateArea( new Triangle());
		
		// Lambda Expressions
		
		Shape s = (d1,d2)->d1*d2;
		System.out.println("Area = " + s.area(20, 20));
		
		s = (d1,d2)->0.5*d1*d2;
		System.out.println("Area = " + s.area(20, 20));
		
		calculateArea((d1,d2)->d1*d2);			// passing lambda expression as an argument
		calculateArea((d1,d2)->0.5*d1*d2);
		
	}
}


