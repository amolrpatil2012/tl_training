
public class Bike implements Vehicle {
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
	public Bike(String brandName, int pricePerHour) {
		super();
		this.brandName = brandName;
		this.pricePerHour = pricePerHour;
	}
	@Override
	public int getRent( int hours)
	{
		return hours*pricePerHour;
	}
	
}
