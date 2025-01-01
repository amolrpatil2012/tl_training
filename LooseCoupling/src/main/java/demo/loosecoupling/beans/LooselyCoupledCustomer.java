package demo.loosecoupling.beans;

public class LooselyCoupledCustomer {

	Vehicle vehicle;
	String name;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getTotalRent ( int hour)
	{
		return vehicle.getRentPerHour()*hour;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
}
