import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassExample {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(34);
		list.add(14);
		list.add(54);
		list.add(24);
		list.add(34);
		
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println(" Min : " + Collections.min(list));
		System.out.println(" Max : " + Collections.max(list));
		
		List<Integer> list1 = new ArrayList<Integer>();
		Collections.addAll(list1, 34,14,24,54,34);
		System.out.println(list1);
		
		
	}
}
