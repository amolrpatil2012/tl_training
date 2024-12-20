
class Counter
{
	int count ;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	// synchronized make its sure that this resource is accessible to one thread at a time
	public synchronized void increment()
	{
		count++;
	}
}

class CounterThread extends Thread
{
	Counter counter;
	public CounterThread ( Counter counter )
	{
		this.counter = counter;
	}
	public void run()
	{
		for(int i=1;i<=10000;i++)
			counter.increment();
	}
}
public class AsyncExample {
	
	public static void main(String[] args) throws InterruptedException {
		
		Counter counter = new Counter();
		counter.setCount(0);
		
		// counter is shared by two threads t1,t2
		
		CounterThread t1 = new CounterThread(counter);
		t1.start();
		CounterThread t2 = new CounterThread(counter);
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(" Counter : " + counter.getCount());
		
		
		
	}

}
