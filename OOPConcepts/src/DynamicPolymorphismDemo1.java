/*
 * 	Annotations 
 *  |
 *  Will provide extra definition to an existing entity [ method , class ]
 *  without modifying 
 *  
 *  Annotation always starts with @
 *  
 *  @Override
 *  
 *  e.g.
 *  		class A
 *  		{
 *  				void show() 
 *  				{ 
 *  				}	
 *  		}
 *  
 *  		class B extends A		--> [ show {A} , shw{B} ]
 *  		{
 *  
 *  				void shw()			// Method Overriding
 *  				{
 *  				}
 *  		}
 *  
 *  		A t = new B();
 *  		t.show();			// Expecting show method of B class
 *  							// Due to spelling mistake in overriding
 *  							// will invoke show method of A class which is inherited in B class
 *  
 * 
 */
abstract class Shape1
{
	protected double d1,d2;
	public Shape1 ( double d1, double d2)
	{
		this.d1 = d1;
		this.d2 = d2;
	}
	public Shape1 ( double d)
	{
		this.d1 = this.d2 = d;
	}	
	
	public abstract double area();
	
}
class Rectangle1 extends Shape1
{

	public Rectangle1(double d1, double d2) {
		super(d1, d2);		
	}
	@Override
	public double area()
	{
		return d1*d2;
	}
	
}
class Triangle1 extends Shape1
{

	public Triangle1(double d1, double d2) {
		super(d1, d2);		
	}
	@Override
	public double area()
	{
		return d1*d2*0.5;
	}
	
}

class Circle1 extends Shape1
{

	public Circle1(double d) {
		super(d);		
	}
	@Override
	public double area()
	{
		return d1*d1*0.5;
	}
	
}

public class DynamicPolymorphismDemo1 {
	
	// s is a super class reference
	public static void calculateArea ( Shape1 s )
	{
		System.out.println(" Area = "  + s.area());
	}
	
	public static void main(String[] args) {
		
		// calling method by passing subclass objects
		
		calculateArea ( new Rectangle1(10, 20));
		calculateArea ( new Triangle1(10,20));
		calculateArea ( new Circle1(20));
		
	}

}
