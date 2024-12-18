import java.util.ArrayList;
import java.util.Scanner;

class Student
{
	private int roll;
	private String name;
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
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	
}
public class ArrayListUsingUserDefinedObjectExample {
	
	public static void main(String[] args) {

		ArrayList<Student> listOfStudents = new ArrayList<Student>();
		
		// Adding
		listOfStudents.add(new Student(1,"Suresh"));
		listOfStudents.add(new Student(2,"Ramesh"));
		listOfStudents.add(new Student(3,"Rohit"));
		listOfStudents.add(new Student(4,"Virat"));
		
		// Traversing
		for ( Student s: listOfStudents)
			System.out.println(s);				// s.toString()
		
		// Searching based on Roll		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Roll : ");
		int roll = scanner.nextInt();
		boolean found = false;				// to check if respective element found or not
		for(Student s:listOfStudents)
		{
			if ( s.getRoll()==roll)
			{
				System.out.println(s);
				found = true;
				break;
			}
		}
		if ( !found )	// if ( found == false)
			System.out.println("Student Not Available");
		
		
		
		// Removing student based on Roll		
		System.out.println("Enter Roll Of Student to Delete : ");
		roll = scanner.nextInt();
		Student temp = null;
		for(Student s:listOfStudents)
		{
			if ( s.getRoll()==roll)
			{
				temp = s;
				break;
			}
		}
		if ( temp == null)
			System.out.println("Student Not Found");
		else
			listOfStudents.remove(temp);
		
		System.out.println("After Removing : " + listOfStudents);
		
	}

}






