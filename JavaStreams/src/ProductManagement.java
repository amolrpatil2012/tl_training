import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

class Product
{
	int id;
	String name;
	float price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
class PriceComparator implements Comparator<Product>
{
	@Override
	public int compare(Product o1, Product o2) {
		
		return Float.compare(o1.price, o2.price);
	}
	
}
public class ProductManagement {
	
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		list.add(new Product(1,"HP Laptop",25000f));
		list.add(new Product(2,"Dell Laptop",35000f));		
		list.add(new Product(3,"Sony Laptop",28000f));
		list.add(new Product(4,"Lenovo Laptop",28000f));
		list.add(new Product(5,"Apple Laptop",90000f));
		
		// Print Laptops Having Price Greater than 30000
		list
			.stream()
			.filter(p->p.getPrice()>30000)
			.forEach(System.out::println);
		
		// Print all products in ascending order of price
		System.out.println(" Products Listed Based on Price ");
		list
			.stream()
			.sorted(new PriceComparator())
			.forEach(System.out::println);
		
		// Print all products in ascending order of name -- Using Java 8 
		System.out.println(" Products Listed Based on Name ");
		list
			.stream()
			.sorted(Comparator.comparing(Product::getName))
			.forEach(System.out::println);
		

		// Print all products in ascending order of price if price remains same then sort on the basis of name 
		System.out.println(" Products Listed Based on Price ");
		list
			.stream()
			.sorted(Comparator.comparing(Product::getPrice).thenComparing(Product::getName))
			.forEach(System.out::println);
		
		
		
	  // Print all products in descending order of price -- Using Java 8 
		System.out.println(" Products Listed Based on Name ");
		list
			.stream()
			.sorted(Comparator.comparing(Product::getPrice).reversed())
			.forEach(System.out::println);
		
		
	  // Find out sum and avg of Price
		
			double avg=
			list
				.stream()
				.collect(Collectors.averagingDouble(Product::getPrice))
				.doubleValue();
			
			double sum=
			list
				.stream()
				.collect(Collectors.summingDouble(Product::getPrice))
				.doubleValue();
			
			System.out.println("Sum of All Prices : " + sum);
			System.out.println("Avg of All Prices : " + avg);
			
		// Statistics
//			
//			double max =
//			list
//			.stream()
//			.collect(Collectors.summarizingDouble(Product::getPrice))
//			.getMax();
//			
//			double min =
//			list
//			.stream()
//			.collect(Collectors.summarizingDouble(Product::getPrice))
//			.getMin();		
//			
//									
//			System.out.println("Max of All Prices : " + max);
//			System.out.println("Min of All Prices : " + min);
//			
			DoubleSummaryStatistics d = 			
			list
			.stream()
			.collect(Collectors.summarizingDouble(Product::getPrice));
			
			System.out.println(d.getAverage());
			System.out.println(d.getMin());
			System.out.println(d.getMax());
			System.out.println(d.getSum());			
			System.out.println(d.getCount());
			
			
	}

}
