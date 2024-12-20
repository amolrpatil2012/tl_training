/*
 * 		class MyThread implements Runnable
 * 		{
 * 				public void run()
 * 				{
 * 						System.out.println("Inside Thread");
 * 				}
 * 		}
 * 		Thread t = new Thread ( new MyThread());
 * 		t.start();
 * 
 * 		-------------------------------------------------------
 * 	
 * 		Runnable r = ()->System.out.println("Inside Thread");  
 * 		Thread t = new Thread ( r );
 * 
 * 		-----------------------------------------------------------
 * 
 * 		Thread t = new Thread ( ()->{
 * 	
 * 				System.out.println("Inside Thread") 
 * 			}
 * 		);
 * 		
 * 
 * 	Runnable - functional interface -- contains only one method -- run() -- lambda expression
 * 
 * 
 * 
 */
public class JoinExample {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t = new Thread ( ()->{			
			for(int i = 1; i <= 10 ; i++)
			{
				System.out.println( Thread.currentThread().getName() + " : " +  i);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t.setName("child");
		t.start();
		
		
		for(int i = 1; i <= 10 ; i++)
		{
			System.out.println(" main : " +  i);			
		}
		
		t.join();		// main thread stops execution until t thread dies		
		
		System.out.println("End of Program");
		
	}
}
