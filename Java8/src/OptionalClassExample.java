import java.util.Optional;

public class OptionalClassExample {

	// sql -- select name from table where roll = 10000
	// getData function can return null value
	public static String getData()
	{
		System.out.println("Connecting To Database");
		String data = "Data";		/// this data is retrieved from database
		return data;
	}
	
	public static Optional<String> getDataUsingOptional()
	{
		System.out.println("Connecting To Database");
		String data = "Data";		/// this data is retrieved from database
		Optional<String> val = Optional.of(data);
		return val;
	}
	
	public static void main(String[] args) {
		
			String s = getData();			
			if ( s != null)			
				System.out.println("Do some processing" + s);			
			else
				System.out.println("Data Not Found");
			
			
			Optional<String> s1 = getDataUsingOptional();
			if ( s1.isPresent())
				System.out.println("Do some processing" + s1.get());
			else
				System.out.println("Data Not Found");
			
			
			
	}
}
