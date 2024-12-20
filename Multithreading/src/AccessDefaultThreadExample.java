
public class AccessDefaultThreadExample {

	public static void show()
	{
		for(int i = 1; i <= 10 ; i++)
			System.out.println("show : " +  i);
		
	}
	
	
	public static void main(String[] args) {
	
		// Default thread created by JVM to execute statements of main function
		
		Thread t = Thread.currentThread();	// returns reference of current thread
		
		System.out.println( t.getName() );				// main
		System.out.println( t.getPriority());				// 5
		System.out.println( t.getThreadGroup().getName());		// main
		
		show();
		
		for(int i = 1; i <= 10 ; i++)
			System.out.println("main : " +  i);
		
	}
}
