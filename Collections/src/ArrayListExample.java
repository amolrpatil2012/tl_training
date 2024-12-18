/*
 * 		Generics is for compiler
 * 
 * 		ArrayList is a DYNAMIC ARRAY -- can add/remove elements
 * 	
 * 		static array :		Integer []arr = { 10,20,30 };
 * 
 * 		Resizing is a time consuming operation
 * 		
 * 		1. Adding Elements to ArrayList [ initial size - 10 ]
 * 
 * 			When we add 11th element
 * 	
 * 				1. Copy original array elements into temp memory
 * 				2. Will delete original list
 * 				3. Create new list with double size [ 20 ]
 * 				4. Copy temp array back to newly created list
 * 			
 * 		2. Removing element [ initial size - 10 ]
 * 
 * 			original list		10	20	30	40	50
 * 			removing 30			10	20  <--40<---50		shifting
 * 
 *  
 *  	Conclusion
 *  	|
 *  	ArrayList is actually an Array so 
 *  	add/remove operations are time consuming
 *  
 * 
 * 							
 * 
 * 
 */

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		// Creating ArrayList
		
		ArrayList<Integer> list = new ArrayList<>();	// creates an array of size 10
		ArrayList<Integer> list1 = new ArrayList<>(20);	// creates an array of size 20
		
		// Adding elements to ArrayList -- append
		list.add(10);			// internally int 10 --> Integer 10  boxing
		list.add(20);
		list.add(30);
		list.add(20);			// can add duplicates
		list.add(null);			// can add null values		
		System.out.println(list);
		
		// Inserting elements
		list.add(2, 40);           // inserted at index value 2
		System.out.println(list);
		
		// Adding one collection to another collection
		ArrayList<Integer> temp = new ArrayList<Integer>();
		temp.add(50);
		temp.add(60);
		list.addAll(temp);
		System.out.println(list);
		
		// Update element in a Collection
		list.set(2, 45);		
		System.out.println(" After Updating : " + list);
		
		// Remove-Delete elements from Collection
		list.remove(2);				// remove element by passing index
		System.out.println(" After Removing 45 : " + list);
		Integer i = 50;
		list.remove(i);			// remove element by passing object value
		System.out.println(" After Removing 50 : " + list);
		
		// Searching element in Collection
		System.out.println(" 50 Available ? " + list.contains(50));
		System.out.println(" 30 Available ? " + list.contains(30));
		System.out.println(" index Of 50 " + list.indexOf(50));			// returns -1 if element is not available
		System.out.println(" index Of 30 " + list.indexOf(30));
		
		// Sorting Collection
		//list.sort(null);
		//System.out.println(" List after Sorting : " + list);
		
		// Traversing List
		
		// 1. Using for loop		
		for ( int j = 0 ; j < list.size() ; j++)		// size -- returns size of list
				System.out.println(list.get(j));		// get -- returns element at given index
		
		//2. Using for-each loop
		System.out.println("---Using for-each ------");
		for ( Integer n : list)
			System.out.println(n);
		
		// This will throw an exception -- ConcurrentModificationException
		// We can not add/remove elements from collection while traversing
//		for ( Integer n : list)
//		{
//			if(n==30)
//				list.remove(n);
//			System.out.println(n);
//		}
		
		
		// 3. Iterator -- to add/remove elements during traversing		
		System.out.println("---Using Iterator ------");
		Iterator<Integer> iter = list.iterator();
		while ( iter.hasNext())					// hasNext -- will check if next element is available
		{
			Integer n = iter.next();
			if ( n != null && n == 30)
				iter.remove();
			System.out.println(n);    // next -- will return next element
		}
		System.out.println("List after removing 30");
		for ( Integer n : list)
			System.out.println(n);
		
		
		list.clear();  // remove all elements of collection
}
}
