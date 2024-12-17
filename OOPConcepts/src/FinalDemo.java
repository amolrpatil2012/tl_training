
/*
 * 	Use of final keyword
 * 
 * 		final int x = 100; 
 * 
 * 		final void show()
 * 
 * 		final class X
 * 
 * final variables :
 * 
 * 		Can set value of final variable only once like constant
 * 
 * final method :
 * 
 * 		Can not override
 * 
 * final class :
 * 
 * 		Can not inherit
 * 
 */

// can not inherit
final class X
{
	final int t ;	
	public X ( int p)
	{
		t = p;
	}
//	public void setT( int t)
//	{
//		this.t=t;
//	}
	public int getT()
	{
		return t;
	}
	// can not override
	final void show()
	{
		System.out.println("Inside final method");
	}
}


public class FinalDemo {
	public static void main(String[] args) {
		
		X p = new X(10);
		System.out.println(" Value of t " + p.getT());
		//p.setT(20);
		//System.out.println(" Value of t after change " + p.getT());
		
		
		
	}

}
