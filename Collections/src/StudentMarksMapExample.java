
// key - student name value -- marks of students in P,C,M

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentMarksMapExample {
	
	public static void main(String[] args) {
		
		// key - string  value - List<Integer> 
		Map<String, List<Integer>> marks = new HashMap<>();
		
		marks.put("Suresh", List.of(34,45,23));
		marks.put("Ramesh", List.of(14,45,33));
		marks.put("Rahul", List.of(44,65,73));
		marks.put("Prakash", List.of(94,25,53));
		
		// Traversing all keys
		// keySet() -- returns set of keys 
		//for ( String name : marks.keySet())
		//{		
		//	System.out.println(name);
		//}
		/*
		 * 			Key						Value
		 * 			Suresh					[ 34 , 45, 23 ]		List
		 * 			Ramesh					[ 14, 45, 33 ]
		 * 
		 * 
		 * 		Set<String>keys =	marks.keySet()
		 */
		
		Set<String>keys =	marks.keySet();
		for(String s:keys)
		{
			List<Integer> list = marks.get(s);				// marks.get("Suresh")
			
			int sum = 0;
			for ( Integer i : list)
			{
				sum  = sum + i;
			}
			double avg = (double) sum / list.size();
			
			System.out.println(s + ":" + avg);
		}
		
		
		
		
		
	}

}
