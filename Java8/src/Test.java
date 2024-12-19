

interface Shape
{
	void area(double d1 , double d2);
}
class Rect implements Shape
{
	@Override
	public void area(double d1, double d2) {
		System.out.println( d1*d2 );		
	}	
}
public class Test {
	
	public static void calculateArea ( Shape s )	// s=s1 Shape s = new Rect();
	{
		s.area(20, 30);
	}
	public static void main(String[] args) {
		
		Shape s1 = new Rect();
		calculateArea(s1);
		
		Shape s2 = (d1,d2)->System.out.println(d1*d2);
		calculateArea(s2);
		
	}

}
