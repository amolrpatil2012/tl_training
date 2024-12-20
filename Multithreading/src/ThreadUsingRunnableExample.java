/*
 * 	Every thread is having predefined priority
 * 
 * 	1 to 10
 * 
 * 	setPriority ( 4 )
 * 
 * 
 */
class MyThreadUsingRunnable implements Runnable
{

	@Override
	public void run() {
		
		for(int i = 1; i <= 10 ; i++)
		{
			System.out.println( Thread.currentThread().getName() + " : " +  i);
//			try {
//				//Thread.sleep(10);
//			} catch (InterruptedException e) {				
//				e.printStackTrace();
//			}
		}
	}
	
}


public class ThreadUsingRunnableExample {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread ( new MyThreadUsingRunnable() );
		t1.setName("first");
		t1.setPriority(1);
		t1.start();
		
		
		Thread t2 = new Thread ( new MyThreadUsingRunnable() );
		t2.setName("second");
		t2.setPriority(10);
		t2.start();
		
		for(int i = 1; i <= 10 ; i++)
		{
			System.out.println(" main : " +  i);
			//Thread.sleep(10);
		}
	}

}
