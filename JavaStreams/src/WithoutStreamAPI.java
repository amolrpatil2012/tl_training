
// List of Students -> Filter Out students having marks > 80 -> Sort These Students in Alphabetical -> Store only names in List

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student
{
	String name;
	int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	
	
}

class NameComparataor implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
}
public class WithoutStreamAPI {
	
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Suresh" , 56));
		list.add(new Student("Ramesh" , 85));
		list.add(new Student("Akash" , 96));
		list.add(new Student("Rahul" , 96));
		list.add(new Student("Rohit" , 86));
		list.add(new Student("Virat" , 86));
		
		List<Student> temp = new ArrayList<Student>();	
		
		
		
		// Filtering
		for( Student s : list)
		{
			if ( s.getMarks() > 80)		
			{
				temp.add(s);			// for sorting purpose
			}
		}
		System.out.println("After Filtering : " + temp);
		// Sort Based on name
		Collections.sort(temp,new NameComparataor());
		System.out.println("After Sorting : " + temp);
		List<String> names = new ArrayList<String>();
		for(Student s : temp)
		{
			names.add(s.getName());
		}		
		System.out.println("Final Output : " + names);
		
		
	}

}
