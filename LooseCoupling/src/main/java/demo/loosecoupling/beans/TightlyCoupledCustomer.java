package demo.loosecoupling.beans;

public class TightlyCoupledCustomer {

	Car car;
	String name;
	
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getTotalRent ( int hour)
	{
		return car.getRentPerHour()*hour;
	}
	
}
