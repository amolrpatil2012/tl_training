
/*
 * 		Abstract Method : Is a method without definition
 *  
 * 		e.g.		abstract int add ( int x , int y);
 * 
 * 		Abstract class :  It is a class which contains one/more abstract methods
 * 
 * 		e.g.		abstract class Calculator
 * 
 * 
 * 		Interface
 * 		|
 * 		Is like an abstract class where
 * 
 * 			* Every method is an abstract and public
 * 			* Every variable is static and final
 * 
 * 		A class implements an Interface
 * 
 * 		syntax :		class X implements Y
 * 
 * 		class X must override all methods of interface Y
 * 
 * 		We can not create an Object of interface 
 * 			Calculator t = new Calculator();		---> Error
 * 
 * 		But we can create reference variable of an interface
 * 			Calculator s;		--> that's ok
 * 
 * 
 */

interface Calculator
{
	int add ( int x , int y);		// by default abstract and public
	double area ( double radius);	
	double pi = 3.14;				// by default static and final [ constant ]
}

class CalculatorImpl implements Calculator
{
	@Override
	public int add ( int x , int y)
	{
		return x+y;
	}
	@Override
	public double area ( double radius)
	{
		return Calculator.pi * radius * radius;
	}
}

public class SimpleInterfaceExample {
	
	public static void main(String[] args) {
		
		// Interface reference can refer to object of class
		// which implements that interface
		
		Calculator calc;		
		calc = new CalculatorImpl();
		
		
		System.out.println( " Addition : " + calc.add(10, 20));
		System.out.println( " Area of circle : " + calc.area(20));
		
		
	
						   // Not object of Calculator but object of Anonymous class which implements Calculator interface		
		Calculator calc1 = new Calculator() {
			
			@Override
			public double area(double radius) {
				return Calculator.pi*radius*radius;
			}
			
			@Override
			public int add(int x, int y) {
				// TODO Auto-generated method stub
				return x+y;
			}
		};
		
	}

}
