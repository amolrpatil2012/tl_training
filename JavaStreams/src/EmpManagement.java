import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Emp
{
	String name,designation,city;
	int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Emp(String name, String designation, String city, int salary) {
		super();
		this.name = name;
		this.designation = designation;
		this.city = city;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", designation=" + designation + ", city=" + city + ", salary=" + salary + "]";
	}
	
	
}
public class EmpManagement {
	
	public static void main(String[] args) {
		
		
		List<Emp> emps = new ArrayList<Emp>();
		emps.add(new Emp("Suresh","Manager","Pune",25000));
		emps.add(new Emp("Ramesh","Clerk","Pune",25000));
		emps.add(new Emp("Rahul","Engineer","Banglore",12000));
		emps.add(new Emp("Rohit","Manager","Pune",25000));
		emps.add(new Emp("Akaash","Manager","Pune",25000));
		
		// Print All Managers
		emps
			.stream()
			.filter(e->e.getDesignation().equals("Manager"))
			.forEach(System.out::println);		// e -> System.out.println(e)
		
			
		// Print All Emps Whose Salary < 20000
		System.out.println("Emps Having Salary < 20000");
		emps
			.stream()
			.filter(e->e.getSalary()<20000)
			.forEach(System.out::println);	
		
		// Print only name of Emps who belongs to Pune City
		System.out.println("Emp Names from Pune City");
		emps
			.stream()
			.filter(e->e.getCity().equals("Pune"))
			.map(e->e.getName())
			.forEach(System.out::println);
				
				
				
		// Print Max Salary
		int maxSalary=
		emps
			.stream()			
			.map(e->e.getSalary())	//e ["Sureh","Pune","Manager",25000] -> 25000
			.max(Comparator.comparingInt(Integer::intValue)).get();
		System.out.println("Max Salary" + maxSalary);
		
		
		
		
		
	}

}
