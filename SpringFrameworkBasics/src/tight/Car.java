package tight;

public class Car {

	private String brandName;
	private int pricePerHour;
	
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getPricePerHour() {
		return pricePerHour;
	}
	public void setPricePerHour(int pricePerHour) {
		this.pricePerHour = pricePerHour;
	}
	public Car(String brandName, int pricePerHour) {
		super();
		this.brandName = brandName;
		this.pricePerHour = pricePerHour;
	}
	
	public int getRent( int hours)
	{
		return hours*pricePerHour;
	}
	
	
}
