import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	
	public static boolean isPalindrome ( String s)
	{
		StringBuffer sb = new StringBuffer(s);
		String rev = sb.reverse().toString();		// reverse string
		return rev.equals(s);
	}

	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<String>();
		Collections.addAll(strList, "demo","nitin","madam","india","abcd");
		
		Predicate<String> checkPalindrome = (s)->{
			StringBuffer sb = new StringBuffer(s);
			String rev = sb.reverse().toString();		// reverse string
			return rev.equals(s);
		};
		
		
		for(String s:strList)
		{
			if ( isPalindrome(s))					/// using regular method
				System.out.println(s);
		}
		
		for(String s:strList)
		{
			if ( checkPalindrome.test(s))			/// using Predicate
				System.out.println(s);
		}
		
		
	}
}
