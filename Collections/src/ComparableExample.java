import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Whenever you want to define comparison between two objects
// Either implement Comparable i/f or Comparator i/f
class Product implements Comparable<Product>
{
	String name;
	int price;
	
	
	
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

	// Define how to compare two product objects
	// return int  value  if this value +  first > second  if this value - second > first
		
	@Override
	public int compareTo(Product o) {
		

		// return this.price - o.price;
		return this.name.compareTo(o.name);
	}

	
	
}

public class ComparableExample {

	public static void main(String[] args) {
		
		
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("Laptop" , 45000));
		products.add(new Product("Desktop" , 35000));
		products.add(new Product("Mouse" , 3000));
		products.add(new Product("Mobile" , 15000));
		
		Collections.sort(products);
		
		System.out.println(products);
		
	}
}
