package demo.firstspringproject.beans;

public class Student {

	private String name;
	private Address homeAddress;		// depedency
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Student(String name, Address homeAddress) {
		super();
		this.name = name;
		this.homeAddress = homeAddress;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", homeAddress=" + homeAddress + "]";
	}
	
	
}
