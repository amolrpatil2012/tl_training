package demo.firstspringproject.beans;

public class Emp {
	
	private String name;
	private Address addr;		// same name as per xml configuration
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", addr=" + addr + "]";
	}
	public Emp(String name, Address addr) {
		super();
		this.name = name;
		this.addr = addr;
	}
	
	

}
