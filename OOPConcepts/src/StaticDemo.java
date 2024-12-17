/*
 * 		Student ---> roll , name 		properties / instance
 * 					 collegeName		static property
 * 
 * 										[][][] -- collegeName
 * 
 * 		Student s1 = new Student();		[][][] -- s1.roll	[][][] -- s1.name
 * 		Student s2 = new Student();		[][][] -- s2.roll	[][][] -- s2.name
 * 
 * 		Static Property
 * 		|
 * 		Only one copy which is shared by all objects
 * 		Static properties we always access by name of class and not by objects
 * 		
 * 
 * 		Static Methods
 * 		|
 * 		Not related instances
 * 		Can only access other static members
 * 
 */
		
class Student
{
	private int roll;
	private String name;
	private static String collegeName;
	
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	public void display()
	{
		System.out.println("Roll : "  + roll);
		System.out.println("Name : "  + name);
		System.out.println("College Name : " + collegeName);
	}
	public static void setCollegeName ( String name)
	{
		 // display();	will give error
		//  roll = 10;
		collegeName = name;
	}
	
}
public class StaticDemo {
	
	public static void main(String[] args) {
		
		// Student.collegeName = "ABC College";		-- if it is not private
		
		Student.setCollegeName("ABC College");
		
		Student s = new Student(10,"Ramesh");
		s.display();
		
		Student s1 = new Student(11,"Suresh");
		s1.display();
		
		
	}

}
