
interface SimpleCalc
{
	int add ( int x  , int y);
	int sub ( int x, int y);
}


public class InnerClassImplementationExample {

	public static void main(String[] args) {
		
		SimpleCalc t = new SimpleCalc() {
			
			// this is a definition of Anonymous class which implements SimpleCalc interface
			
			@Override
			public int sub(int x, int y) {
				return x+y;
			}
			
			@Override
			public int add(int x, int y) {
				return x-y;
			}
		};
		
		System.out.println("Add :" + t.add(10, 20));
		System.out.println("Sub : " + t.sub(20, 20));
		
		
		
		
		
	}
}
