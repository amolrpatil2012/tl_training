
public class Demo {

	public static void main(String[] args) {
		
		
		
		Customer cust1 = new Customer(new Car("Honda",100));
		
		System.out.println("Name : " + cust1.getName());
		System.out.println("Rent : " + cust1.getVehicle().getRent(10));
		
		cust1.setVehicle( new Bike("Bajaj",50));
		System.out.println("Rent : " + cust1.getVehicle().getRent(10));
		
		
	}
}
