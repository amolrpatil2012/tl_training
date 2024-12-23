class Student
{
	private int roll;
	private String name;
	private Address homeAddress;			// dependency
	
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
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
	public Student(int roll, String name, Address homeAddress) {
		super();
		this.roll = roll;
		this.name = name;
		this.homeAddress = homeAddress;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", homeAddress=" + homeAddress + "]";
	}	
	
	
	
}

class Address
{
	private String city , state , country;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
	
}

public class DependencyExample {
	
	public static void main(String[] args) {
		
		// passing address object to student object -- dependency injection
		
		Address address = new Address("Mumbai","Maharashtra","India");
		
		Student student = 
				new Student(1 , "Suresh" , address);  
				// dependency Injection through constructor
		
		
		student.setHomeAddress(address);  
		// dependency injection through setter method
		
		
		
		
		
	}

}
