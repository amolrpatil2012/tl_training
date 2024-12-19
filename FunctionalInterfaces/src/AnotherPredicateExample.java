import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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
public class AnotherPredicateExample {
	
	public static void main(String[] args) {
		
		List<Emp> emps = new ArrayList<Emp>();
		emps.add(new Emp("Suresh","Manager","Pune",25000));
		emps.add(new Emp("Ramesh","Clerk","Pune",25000));
		emps.add(new Emp("Rahul","Engineer","Banglore",12000));
		emps.add(new Emp("Rohit","Manager","Pune",25000));
		emps.add(new Emp("Akaash","Manager","Pune",25000));
		
		Predicate<Emp> p1 = (emp)-> emp.getDesignation().equals("Manager");
		
		for(Emp emp : emps)
			if(p1.test(emp))
				System.out.println(emp);
		
		Predicate<Emp> p2 = (emp)-> emp.getCity().equals("Pune");
		for(Emp emp : emps)
			if(p2.test(emp))
				System.out.println(emp);
		
		
	}

}
