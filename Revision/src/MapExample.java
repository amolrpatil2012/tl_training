
/*
 * 	Map -- is a collection of key and value
 * 
 * 	Banking Application
 * 
 * 		AccountNo -- key			Customer Data -- value
 * 		|
 * 		HDFC120						Suresh , 34 , Mumbai , 45000
 * 		HDFC121					
 * 
 * 
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Customer
{
		String name;
		int age;
		String address;
		int balance;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}
		@Override
		public String toString() {
			return "Customer [name=" + name + ", age=" + age + ", address=" + address + ", balance=" + balance + "]";
		}
		public Customer(String name, int age, String address, int balance) {
			super();
			this.name = name;
			this.age = age;
			this.address = address;
			this.balance = balance;
		}
		
		
		
}
public class MapExample {
	
	public static void main(String[] args) {
		
		
			Map<String, Customer> custData = new HashMap<String, Customer>();
			
			Customer cust1 = new Customer("Suresh",34,"Mumbai",45000);
			custData.put("HDFC101", cust1);
			
			Customer cust2 = new Customer("Ramesh",34,"Pune",35000);
			custData.put("HDFC102", cust2);
			
			Customer cust3 = new Customer("Rohit",40,"Mumbai",35000);
			custData.put("HDFC103", cust3);
			
			Customer cust4 = new Customer("Virat",45,"Delhi",45000);
			custData.put("HDFC104", cust4);
			
			
			System.out.println(" Current Map " + custData);
			
			// keySet -- return set of keys			  set of acc nos	
			// values -- return collection of values  collection of cust objects
			// entrySet -- return collection of key-value
			
			// entry variable -- single entry of collection
			for (Entry<String, Customer> entry : custData.entrySet())
			{
				String accno = entry.getKey();
				Customer cust = entry.getValue();
				
				if ( cust.getAddress().equals("Mumbai"))
				{
					System.out.println(accno + " : " +cust) ;
					
				}
				
			}
			
			
			
			
			
			
		
		
	}
	

}
