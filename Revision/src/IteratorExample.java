import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {
		
		List<String> strs = new ArrayList<String>();
		Collections.addAll(strs, "Suresh","Ramesh","Rohit","Rahul","Pravin");
		
		// traditional for loop
		for ( int i = 0 ; i<strs.size() ; i++)
			System.out.println(strs.get(i));
		
		System.out.println("----Using for-each Loop ----");
		// for-each
		for ( String s : strs)
		{
			//if(s.startsWith("P"))		// ConcurrentModificationException
				//strs.remove(s);
			
			System.out.println(s);
		}
		System.out.println("----Using for-each Stream Method ----");
		// for-each terminal method under stream
		strs.forEach(System.out::println);
		
		// Using iterator we can add/remove element in collection during traversing
		System.out.println("----Using Iterator ----");
		Iterator<String> iterator = strs.iterator();
		while ( iterator.hasNext())
		{
			String s = iterator.next();
			if ( s.startsWith("P"))
				iterator.remove();
			
			System.out.println(s);
		}
			
		System.out.println("---------- After Removing ------");
		strs.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
	}
}
