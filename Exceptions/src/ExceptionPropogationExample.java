/*	
 * 		void show() throws Exception
 * 
 * 		When calling show method
 * 
 * 		1. Call show method inside try block
 * 
 * 				void display()
 * 				{
 * 					try
 * 					{
 * 							show();
 * 					}
 * 					...
 * 				}
 * 
 * 		2.  Add throws clause in caller method
 * 
 * 				void display() throws Exception
 * 				{
 * 						show();
 * 				}
 * 
 * 
 */


// User defined Exception 
class PriceNotValidException extends Exception
{
	public PriceNotValidException ( String message )
	{
		super(message);
	}
}

class Product
{
	private int price;
	private String name;
	
	public Product ( int price , String name)
	{
		this.price = price;
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class ExceptionPropogationExample {
	
	
	public static void addProduct ( Product p )throws PriceNotValidException
	{
		if ( p.getPrice() > 1000)
			throw new PriceNotValidException("Price is Not Valid");
		else
			System.out.println("Product is OK ");
	}
	
	public static void addProductInStore ( Product p)throws PriceNotValidException
	{
		addProduct(p);			// write a try-catch or add throws option
	}
	
	public static void main(String[] args) throws PriceNotValidException {
		
		
			Product p = new Product(2000,"Laptop");
			addProductInStore(p);			// write a try-catch or add throws option
		
	
		
	}	
	
	
	

}
