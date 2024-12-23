package demo.firstspringproject.beans;

public class Customer {

	Vehicle vehicle;	// depends on Vehicle -- loosely coupled

	public Customer(Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
	}
	public Customer()
	{
		
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	
	
}
