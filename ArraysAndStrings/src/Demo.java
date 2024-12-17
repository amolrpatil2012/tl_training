
class A
{
	
}
public class Demo {

	public static int show(int x)
	{
		int y = x+10;				// x and y are stored in STACK 
		
		return y;					// Stack --- LIFO
	}
	public static void main(String[] args) {
		
		A t = new A();			/// Heap Memory Area
		
		int x[] = new int[10];	/// Heap Memory Area
		
		String s = "Hello";		/// Heap Memory Area
		
		show(10);
		
		
	}
	
}
