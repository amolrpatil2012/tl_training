import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

class Laptop
{
	private int price;
	private String processor;
	
	@Override
	public String toString() {
		return "Laptop [price=" + price + ", processor=" + processor + "]";
	}
	public Laptop(int price, String processor) {
		super();
		this.price = price;
		this.processor = processor;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	
}

// Collection   "HP" , new Laptop(10000 , "I3" )

public class HashMapExample {
	
	public static void main(String[] args) {
		
		Map<String, Laptop> laptops = new HashMap<String, Laptop>();
		
		laptops.put("HP", new Laptop(75000,"I5"));
		laptops.put("ACER", new Laptop(45000,"I5"));
		laptops.put("Dell", new Laptop(75000,"I5"));
		laptops.put("Lenovo", new Laptop(65000,"I5"));
		
		// Get Laptop Details based on Key [ brandname ]
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Brand Name :");
		String brandName = scanner.nextLine();
		
		if ( laptops.containsKey(brandName))
			System.out.println(laptops.get(brandName));
		else
			System.out.println( brandName + " Not exist");
		
		
		// Change value of Price for given Brand		
		
		
		System.out.println("Enter Brand Name :");
		brandName = scanner.nextLine();
		
		if ( laptops.containsKey(brandName))
		{
			Laptop laptop = laptops.get(brandName);
			System.out.println(" Original Info : " + laptop);
			
			System.out.println("Enter New Price");
			int price = scanner.nextInt();
			laptop.setPrice(price);
			
			System.out.println(" Updated Info : " + laptop);
			
		}
		else
			System.out.println( brandName + " Not exist");
		
		
		// Remove Info of Given brand
		
		
		System.out.println("Enter Brand Name :");
		brandName = scanner.nextLine();
		
		if ( laptops.containsKey(brandName))
		{
			laptops.remove(brandName);
			System.out.println(laptops);
		}
		else
			System.out.println( brandName + " Not exist");
		
		
		// Traversing Map Keys		
		// keySet() -- returns Set of keys
		
		for ( String key : laptops.keySet())
			System.out.println(key);
		
		// Traversing Map Values		
		// values() --- returns Collection of values
		
		for ( Laptop l : laptops.values())
			System.out.println(l);
		
		
		// Traversing Map using key-value
		// entrySet()  --- returns Set of Map.Entry interface
		
		for ( Entry<String, Laptop> entry : laptops.entrySet())		
			System.out.println( entry.getKey() +":" + entry.getValue());
		
		
		
		
	}

	
}
