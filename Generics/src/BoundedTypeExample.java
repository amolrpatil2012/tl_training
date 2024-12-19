/*
 * 
 * 		We want to make it compulsory that T should be some numeric type
 * 
 * 		Integer / Float / Double / Byte / Short / Long
 * 		|
 * 		All are subclass of Number class
 */

// Bounded Type :  T will be surely subclass of Number
class Calculator<T extends Number>
{
	private T number;
	public Calculator ( T t )
	{
		number = t;
	}
	public double getSquare()
	{
		return number.doubleValue() * number.doubleValue();
	}
}



public class BoundedTypeExample {

	public static void main(String[] args) {
		
		Calculator<Integer> intValue = new Calculator<>(100);
		System.out.println(intValue.getSquare());
		
		Calculator<Double> doubleValue = new Calculator<>(34.56);
		System.out.println(doubleValue.getSquare());
		
		//Calculator<String> strValue = new Calculator<>("demo");
		// can not use any other type except Number and its subclasses
		
		
		
		
		
	}
}
