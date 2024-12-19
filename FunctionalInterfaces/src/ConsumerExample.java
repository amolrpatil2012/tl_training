import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	
	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		Collections.addAll(intList, 2,5,12,45,23,56,34);
		
		Consumer<Integer> consumer = (n)->{
			
			if ( n%2==0)
				System.out.println( n + " Even ");
			else
				System.out.println( n + " Odd ");
		};
		
		
		for ( Integer i : intList)
			consumer.accept(i);
		
	}

}
