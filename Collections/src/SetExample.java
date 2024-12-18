/*	
 * 		Set
 * 		|
 * 		No duplicates
 * 		Not maintain order
 * 		No null element
 *  * 
 * 
 * 		HashSet does not follow insertion Order
 * 		HashSet does not allow duplicate elements
 * 		HashSet allows single null element
 * 
 * 		LinkedHashSet does follows insertion Order
 * 		LinkedHashSet does not allow duplicate elements
 * 		LinkedHashSet allows single null element
 * 
 * 		TreeSet does follows ascending Order
 * 		TreeSet does not allow duplicate elements
 * 		TreeSet not allows null element
 * 
 * 		HashSet is faster compare to LinkedHashSet and TreeSet
 * 
 */
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(20);
		hashSet.add(10);
		hashSet.add(30);
		hashSet.add(50);	
		hashSet.add(50);
		hashSet.add(40);
		hashSet.add(40);
		hashSet.add(null);
		System.out.println("HashSet : " + hashSet);
		
		LinkedHashSet<Integer> lhashSet = new LinkedHashSet<Integer>();
		lhashSet.add(20);
		lhashSet.add(10);
		lhashSet.add(30);
		lhashSet.add(50);	
		lhashSet.add(50);
		lhashSet.add(40);
		lhashSet.add(40);
		lhashSet.add(null);
		System.out.println("LinkedHashSet : " + lhashSet);
		

		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(20);
		treeSet.add(10);
		treeSet.add(30);
		treeSet.add(50);	
		treeSet.add(50);
		treeSet.add(40);
		treeSet.add(40);
		//treeSet.add(null);
		System.out.println("TreeSet : " + treeSet);
		
	}

}
