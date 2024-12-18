import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee
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
	public Employee(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [age=" + age + ", name=" + name + "]";
	}
		
	
}

class AgeComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.age - o2.age;
	}
	
}
class NameComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
}

public class ComparatorExample {
	
	public static void main(String[] args) {
		// List of Emp
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee(23,"Suresh"));
		emps.add(new Employee(13,"Rohit"));
		emps.add(new Employee(43,"Abhay"));
		emps.add(new Employee(33,"Rohan"));
		Collections.sort(emps, new NameComparator());
		System.out.println(emps);
		Collections.sort(emps, new AgeComparator());
		System.out.println(emps);
	}

}
