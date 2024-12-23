package demo.firstspringproject.beans;

public class Car implements Vehicle {

	private int rentPerHour;
	private String brand;
	
	public Car() {} 
	
	public Car(int rentPerHour, String brand) {
		super();
		this.rentPerHour = rentPerHour;
		this.brand = brand;
	}

	public int getRentPerHour() {
		return rentPerHour;
	}

	public void setRentPerHour(int rentPerHour) {
		this.rentPerHour = rentPerHour;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public int getRent(int hours) {
		return rentPerHour*hours;
	}

}
