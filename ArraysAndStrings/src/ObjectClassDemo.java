
/*
 * 		java.lang.Object class
 * 		|
 * 		Is a super class of every java class
 * 
 * 		int hashCode() --- returns hash code of given object
 * 
 * 		String toString() --- return  String representation of an Object
 * 
 * 
 */
class Student					// class Student extends Object
{
	private int roll;
	private String name;	
	

	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	
	public Student() {}
	
	@Override
	public String toString()
	{
		//return "This is my implementaation of toString";
		return " Roll : " + roll + " Name : " + name;
	}
	
	
}

class Emp
{
	int age;
	String name;
	
	@Override
	public String toString() {
		return "Emp [age=" + age + ", name=" + name + "]";
	}
	
	
	
}

public class ObjectClassDemo {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		System.out.println(s.hashCode());
		
		Student s1 = new Student();
		System.out.println(s1.hashCode());
		
		Student s2 = new Student(1 , "Suresh");
		
		System.out.println( " to String " + s2.toString());
		System.out.println( " to String " + s2);				// s2.toString
	}

}
