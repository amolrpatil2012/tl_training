import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student
{
	int roll;
	String name;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	
	
}

class RollComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.roll - o2.roll;
	}
	
}



public class StreamExample {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();
		list.add(new Student(10,"Suresh"));
		list.add(new Student(15,"Rahul"));
		list.add(new Student(6,"Yash"));
		list.add(new Student(23,"Pravin"));
		list.add(new Student(12,"Rohit"));
		
		// store only names of first 3 roll nos name
		
		// sorting of list based on roll number
		Collections.sort(list, new RollComparator());		
		List<String> names = new ArrayList<String>();
		for ( int i = 0 ; i<3 ; i++)
		{			
			names.add(list.get(i).getName());
		}				
		System.out.println(names);
		
		List<String> names1=
		list
			.stream()								// create stream
			.sorted(Comparator.comparing(Student::getRoll))
			.limit(3)
			.map(s->s.getName())
			.distinct()
			.collect(Collectors.toList());
		
		System.out.println(names1);
		
		
		
		
	}
	
	
	
	
	
}
