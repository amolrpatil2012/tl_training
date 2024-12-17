/*
 * Inheritance Rules :
 * 
 * 	Super classes are always for guidelines / standards / idea
 * 
 *  Super classes are always generic e.g. area of shape
 *  and sub classes are always specific e.g. area of circle
 *  
 *  We always create an object of subclasses
 * 
 * 
 * v.imp :
 * 
 * 	super class reference variable can refer to subclass object
 * 		Shape s;
 * 		s = new Rectangle();
 * 
 * Abstract Function : Is a function without body/definition
 * 
 * Abstract class : Is a class which contains one or more abstract methods
 * 
 * We can not create an Object of abstract class * 
 * 		Shape s = new Shape(10,20);		---> Error
 * 
 * But we can create reference variable of an abstract class
 * 		Shape s;		--> that's ok
 * 
 */
abstract class Shape
{
	protected double d1,d2;
	public Shape ( double d1, double d2)
	{
		this.d1 = d1;
		this.d2 = d2;
	}
	public Shape ( double d)
	{
		this.d1 = this.d2 = d;
	}	
	
	public abstract double area();
	
}
class Rectangle extends Shape
{

	public Rectangle(double d1, double d2) {
		super(d1, d2);		
	}
	public double area()
	{
		return d1*d2;
	}
	
}
class Triangle extends Shape
{

	public Triangle(double d1, double d2) {
		super(d1, d2);		
	}
	public double area()
	{
		return d1*d2*0.5;
	}
	
}

class Circle extends Shape
{

	public Circle(double d) {
		super(d);		
	}
	public double area()
	{
		return d1*d1*0.5;
	}
	
}

public class DynamicPolymorphismDemo {
	
	public static void main(String[] args) {
		
		Shape s;			// super class reference variable
		
		//s = new Shape(10,20);
		//System.out.println("Area of Shape : " + s.area());		

		
		s = new Rectangle(10,20);
		System.out.println("Area of Rectangle : " + s.area());	
		
		s = new Triangle(10,20);
		System.out.println("Area of Triangle : " + s.area());
		
		s = new Circle(10);
		System.out.println("Area of Circle : " + s.area());
		
		
		
		/*	According to compiler area method whatever we are calling
		 * 	all are from Shape class
		 * 
		 * But during execution variable s refers to different objects
		 * and calling area methods of different classes
		 * 
		 * Thats why it is Dynamic Polymorphim / Run time Polymorphism
		 * 
		 */
		
		
	}

}
