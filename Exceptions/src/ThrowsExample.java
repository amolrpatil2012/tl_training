/*
 * 		throws keyword
 * 		|
 * 		Used to throw exception
 * 
 * 		void show() throws Exception
 * 		|
 * 		show(); --> need to implement try-catch
 * 		
 * 		 
 * 
 */



public class ThrowsExample {

		public static void main(String[] args) {
		
		
		System.out.println("Enter Any No");
		try
		{
			int n = System.in.read();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
