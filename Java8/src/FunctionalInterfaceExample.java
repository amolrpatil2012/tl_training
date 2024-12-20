
@FunctionalInterface			// which contains only one abstract method
interface Calculator
{
	int add ( int x , int y);	
		
}

class CalculatorImpl implements Calculator
{
	@Override
	public int add(int x, int y) {
		return x+y;
	}	
}

public class FunctionalInterfaceExample {
	
	public static void main(String[] args) {
		
		Calculator calc = new CalculatorImpl();
		System.out.println(calc.add(20, 30));
		
		// Implementation Anonymous class
		Calculator calc1 = new Calculator() {			
			@Override
			public int add(int x, int y) {
				return x+y;
			}
		};
		System.out.println(calc1.add(20, 30));
		
		
	}

}
