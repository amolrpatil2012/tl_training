import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class WithStream {
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Suresh" , 56));
		list.add(new Student("Ramesh" , 85));
		list.add(new Student("Akash" , 96));
		list.add(new Student("Rahul" , 96));
		list.add(new Student("Rohit" , 86));
		list.add(new Student("Virat" , 86));
		
		//Stream<Student> ss = list.stream();		// create stream
		
		//ss = ss.filter(s->s.getMarks()>80);		// filter operation
		
		List<String> names =
		list
			.stream()						// Creation 
			.filter(s->s.getMarks()>80)		// intermediate
			.sorted(new NameComparataor())	// intermediate
			.limit(3)                       // intermediate  
			.map ( s->s.getName())			// intermediate
			.toList();						// terminal
		
		System.out.println(names);
		
		
	}

}
