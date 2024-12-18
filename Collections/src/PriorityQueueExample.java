
// Removal operation of Priority Queue is based on priority

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(45);
		pq.add(23);
		pq.add(67);
		pq.add(23);
		pq.add(89);
		
		System.out.println("Current Queue : " + pq);
		System.out.println(" Removed Element :" + pq.remove());
		
	}
}
