
class Emp
{
	String name,designation,city;
	int salary;
	public String getName() {
		return name;
	}
	public Emp setName(String name) {
		this.name = name;
		return this;
	}
	public String getDesignation() {
		return designation;
	}
	public Emp setDesignation(String designation) {
		this.designation = designation;
		return this;
	}
	public String getCity() {
		return city;
	}
	public Emp setCity(String city) {
		this.city = city;
		return this;
	}
	public int getSalary() {
		return salary;
	}
	public Emp setSalary(int salary) {
		this.salary = salary;
		return this;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", designation=" + designation + ", city=" + city + ", salary=" + salary + "]";
	}
	
	
}
public class MethodChainExample {

	public static void main(String[] args) {
		
		
		Emp emp = new Emp ();
		emp.setName("Suresh");
		emp.setDesignation("Manager");
		emp.setCity("Pune");
		emp.setSalary(34000);
		
		//-----------------------
		
		Emp emp1 = new Emp ();				// Method Chaining
		emp1
			.setName("Ramesh")
			.setCity("Banglore")
			.setDesignation("Manager")
			.setSalary(20000);
		
		//emp1.setName("Ramesh").setCity("Banglore").setDesignation("Manager").setSalary(40000);
		
		
		
		
		
		
		
		System.out.println(emp);
		System.out.println(emp1);
		
	}
}
