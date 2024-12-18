/*
 * 		LinkedList implements Dequeue interface 
 * 
 * 		Dequeue -- Double Ended Queue [ Stack+Queue ]
 * 
 * 	Adding elements in Dequeue
 * 
 * 		add / offer / addLast		-> Adds element at end of queue
 * 		addFirst					-> Adds element at start queue
 * 
 */

import java.util.LinkedList;

public class QueueExample {

	public static void main(String[] args) {
		
		LinkedList<String> queue = new LinkedList<String>();
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.add("D");
		queue.addLast("E");
		
		queue.addFirst("XYZ");
		
		System.out.println("Current Queue : " + queue);
		
		System.out.println(" Removing First Element : " + queue.removeFirst());
		System.out.println("Current Queue : " + queue);
		

		System.out.println(" Removing First Element : " + queue.removeLast());
		System.out.println("Current Queue : " + queue);
		
		System.out.println(" Removing First Element : " + queue.poll());
		System.out.println("Current Queue : " + queue);
		
		System.out.println(" Peek First Element : " + queue.peekFirst());
		System.out.println("Current Queue : " + queue);
		
		System.out.println(" Peek First Element : " + queue.peekLast());
		System.out.println("Current Queue : " + queue);
		
		
	}
}
