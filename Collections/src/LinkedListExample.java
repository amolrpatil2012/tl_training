/*
 * 		LinkedList -- Is Doubly Linked List
 * 
 * 		1. Add/Remove operations are efficient
 * 		2. Traversing or searching is time consuming operation
 * 
 */

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Suresh");
		list.add("Rahul");
		list.add("Rohit");		
		list.add(1,"Virat");
		
		System.out.println(list);
		
		if ( list.contains("Rohit"))
			System.out.println("Rohit is available");
		
		System.out.println("Index of Rahul:" + list.indexOf("Rahul"));
		
		list.remove("Virat");
		
		System.out.println(" After Remving Virat " + list);
		
		list.set(1, "XUZ");
		System.out.println(" Element at 1 " + list.get(1));
		
		
	}
}
