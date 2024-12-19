import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Customer
{
	private int age;
	private int balance;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Customer(int age, int balance, String name) {
		super();
		this.age = age;
		this.balance = balance;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [age=" + age + ", balance=" + balance + ", name=" + name + "]";
	}
	
	
}
public class MapExample {
	
	public static void main(String[] args) {
		
		// HashMap Does.nt follow Insertion Order
		//   key      value		
		Map<Integer, Customer> customers = new HashMap<>();
		
		// put method -- used to add key-value pair in map
		customers.put(12345, new Customer(23,5000,"Suresh"));
		customers.put(42346, new Customer(43,15000,"Ramesh"));
		customers.put(22347, new Customer(33,45000,"Rahul"));
		
		customers.put(12548, new Customer(63,56000,"Virat"));
		customers.put(12548, new Customer(63,56000,"Sachin"));
		
		customers.put(null, new Customer(63,56000,"Sunil"));
		
		System.out.println(customers);
		
		// LinkeHashMap Does follow Insertion Order
		
		Map<Integer, Customer> customers1 = new LinkedHashMap<>();
		
		// put method -- used to add key-value pair in map
		customers1.put(34345, new Customer(23,5000,"Suresh"));
		customers1.put(56346, new Customer(43,15000,"Ramesh"));
		customers1.put(23347, new Customer(33,45000,"Rahul"));
		
		customers1.put(67348, new Customer(63,56000,"Virat"));
		customers1.put(67348, new Customer(63,56000,"Sachin"));
		
		customers1.put(null, new Customer(63,56000,"Sunil"));
		
		System.out.println(customers1);
		
		
		// TreeMap Does follow Ascending Order Based on Key
		
		Map<Integer, Customer> customers2 = new TreeMap<>();
				
		// put method -- used to add key-value pair in map
		customers2.put(34345, new Customer(23,5000,"Suresh"));
		customers2.put(56346, new Customer(43,15000,"Ramesh"));
		customers2.put(23347, new Customer(33,45000,"Rahul"));
				
		customers2.put(67348, new Customer(63,56000,"Virat"));
		customers2.put(67348, new Customer(63,56000,"Sachin"));
				
		//customers2.put(null, new Customer(63,56000,"Sunil"));
				
		System.out.println(customers2);
	}

}
