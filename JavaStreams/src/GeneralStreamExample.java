import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GeneralStreamExample {

	public static void main(String[] args) {
		
		List<Integer> nos = new ArrayList<>();
		for(int i = 1 ; i < 10 ; i++)
			nos.add(i);
		
		System.out.println("List : " + nos );
		
		// Find All Even Nos and Store in another List
		
		List<Integer> temp=
		nos
			.stream()							// Create Stream
			.filter(i->i%2==0)					// Intermediate Operation : Filter
			.collect(Collectors.toList());		// Terminal Operation : Collecting output in a List
			
		System.out.println("Even Nos " + temp);
		
		// Find All Even Nos and Store output in an Array
		
		Object o[]=
		nos
			.stream()
			.filter(i->i%2==0)
			.toArray();
		System.out.println(Arrays.toString(o));
		
		// Find All Even Nos and Print on Screen
		
		nos
			.stream()
			.filter(i->i%2==0)
			//.forEach(n->System.out.println(n));
			.forEach(System.out::println);          // Method Reference
		
		
		List<String> names = new ArrayList<String>();
		names.add("Shekhar");
		names.add("Suresh");
		names.add("Amitabh");
		names.add("Aman");
		names.add("Lokesh");
		names.add("Ramesh");
		
		// Print all names starting with letter A
		
		names
			.stream()
			.filter(name->name.startsWith("A"))
			.forEach(System.out::println);
		
		// Print all names where name length > 5 in Capital letters
		// Aman -> AMAN
		
		names
			.stream()		
			.filter(name->name.length()>5)
			.map(name->name.toUpperCase())			// intermediate -- map 
			.forEach(System.out::println);
			
		// Print all names where name length > 5 in Capital letters in Alphabetical order
		
		System.out.println("--- Sorted Output ---");
		names
			.stream()		
			.filter(name->name.length()>5)
			.map(name->name.toUpperCase())			
			.sorted()
			.forEach(System.out::println);
		
		
		// Print 3 names where name length > 5 in Capital letters in Alphabetical order
		
		System.out.println("--- Sorted Output With 3 Limit ---");
		names
			.stream()		
			.filter(name->name.length()>5)
			.map(name->name.toUpperCase())			
			.sorted()
			.limit(3)
			.forEach(System.out::println);
		
		//------------------------------
		
		// anyMatch , allMatch , noneMatch
		boolean b =
		names
			.stream()
			.anyMatch(s->s.startsWith("A"));
		
		System.out.println( " Collection contains at least one name which starts with A " + b);
		
		b =
		names
			.stream()
			.allMatch(s->s.startsWith("A"));
				
		System.out.println( " Collection contains All names starts with A " + b);
				
		
		b =
		names
			.stream()
			.noneMatch(s->s.startsWith("A"));
						
		System.out.println( " Collection contains no name starts with A " + b);
						
		//--------------------------------------------------
		
		// Count how many strings start with letter A
		long l=
		names
			.stream()
			.filter(s->s.startsWith("A"))
			.count();
		
		System.out.println(" Names starting with A " + l);
		
		
	}
}
