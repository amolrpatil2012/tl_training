
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Emp implements Comparable<Emp>
{
	int age;
	String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Emp(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [age=" + age + ", name=" + name + "]";
	}
	
	// this method will compare two emp objects
	/*
	 * 	if function returns positive value first object > second object
	 *  if function returns negative value second object > first object
	 *  if function return 0 both are same
	 * 
	 */
	@Override
	public int compareTo(Emp emp) {
		
		return this.age - emp.age;				// comparison of emp objects on basis of age
		//return this.name.compareTo(emp.name);		// comparison of emp objects on basis of name
		// return emp.age - this.age -- in descending order		
	}
	
	
	
	
}

public class SortExample {
	public static void main(String[] args) {
		
		// List of Integers	
	
		
		// Most used approach to create and elements
		List<Integer> nos = new ArrayList<Integer>();
		nos.add(34);
		nos.add(45);
		nos.add(23);
		nos.add(12);
		System.out.println(nos);
		
		// This is for simple testing programs
		List<Integer> listOfNos = List.of(34,45,23,12);
		//listOfNos.add(45);							// error
		System.out.println(listOfNos);
		
		Collections.sort(nos);
		System.out.println("Sorted Output : " + nos);
		
		Collections.reverse(nos);
		System.out.println("Reversed Collection : " + nos);
		
		System.out.println( " Min " + Collections.min(nos));
		System.out.println( " Max " + Collections.min(nos));
		
		
		// List of String
		
		List<String> stringList =new ArrayList<String>();
		stringList.add("Rohit");
		stringList.add("Rahul");
		stringList.add("Abhay");
		stringList.add("Suresh");
		Collections.sort(stringList);
		System.out.println(stringList);
		
		
		// List of Emp
		List<Emp> emps = new ArrayList<Emp>();
		emps.add(new Emp(23,"Suresh"));
		emps.add(new Emp(13,"Rohit"));
		emps.add(new Emp(43,"Abhay"));
		emps.add(new Emp(33,"Rohan"));
		Collections.sort(emps);
		System.out.println(emps);
		
		
		
	}

}
