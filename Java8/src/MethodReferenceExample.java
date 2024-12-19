
@FunctionalInterface
interface SingleDigitCheck
{
	boolean checkSingleDigit(int n);
}

class Digit
{
	public static boolean isSingle(int n)
	{
		return n>-10 && n<10;
	}
}



public class MethodReferenceExample {
	public static void main(String[] args) {
		
		// Define interface A using Lambda Expression
		
		SingleDigitCheck t = (n) -> n > -10 && n < 10;
		System.out.println(t.checkSingleDigit(5));
		
		// Calling Digit.isSingle inside lambda Expression
		SingleDigitCheck t1 = (n)->Digit.isSingle(n);
		System.out.println(t1.checkSingleDigit(5));
		
		// Calling Digit.isSingle using Method Reference
		SingleDigitCheck t2 = Digit::isSingle;
		System.out.println(t2.checkSingleDigit(5));
		
	
		
		
	}
	

}
