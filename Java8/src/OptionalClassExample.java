


public class OptionalClassExample {

	// sql -- select name from table where roll = 10000
	// getData function can return null value
	public static String getData()
	{
		System.out.println("Connecting To Database");
		String data = null;		/// this data is retrieved from database
		return data;
	}
	
	public static void main(String[] args) {
		
			String s = getData();
			if ( s != null)
			{
				System.out.println("Do some processing");
			}
			else
				System.out.println("Data Not Found");
			
			
	}
}
