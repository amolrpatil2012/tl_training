/*
 * 
 * 	Thread.sleep :- stop execution of thread for given ms
 * 
 * 		Thread.sleep(10);		
 */


class MyThread extends Thread
{
	@Override
	public void run()
	{
		for(int i = 1; i <= 10 ; i++)
		{
			System.out.println( getName() + " : " +  i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
	}
}

public class MultithreadingExample {
	
	public static void main(String[] args) throws InterruptedException {		// main thread -- parent 

		Thread t = new MyThread();					// t thread -- child thread
		t.setName("first");
		t.start();
		
		Thread t1 = new MyThread();					// t1 thread -- child thread
		t1.setName("second");
		t1.start();
		
		for(int i = 1; i <= 10 ; i++)
		{
			System.out.println(" main : " +  i);
			Thread.sleep(10);
		}
	}

}
