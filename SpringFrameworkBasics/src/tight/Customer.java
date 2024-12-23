package tight;

public class Customer {

	private String name;
	private Car car;				// dependency Injection
	
	public Customer(Car car)
	{
		this.car = car;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", car=" + car + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
	
	
}
