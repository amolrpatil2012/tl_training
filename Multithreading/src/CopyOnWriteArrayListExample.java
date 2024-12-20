import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
	public static void main(String[] args) throws InterruptedException {
		
		List<Integer> list = new CopyOnWriteArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		
		for ( Integer n : list)
		{
			if(n==30)
				list.remove(n);
			System.out.println(n);
		}
		
		System.out.println(list);
		
	}

}
