
// Arrays class contains static methods to work on arrays

import java.util.Arrays;
import java.util.List;

public class ArraysClassExample {

	public static void main(String[] args) {
		
		int a[] = { 45 , 23 , 56 ,67 ,23, 44, 12 };		
		Arrays.sort(a);		
		System.out.println(Arrays.toString(a));
		
		char c[] = {'B','C','D','X'};
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		
		// Collection of array
		
		int x[] = { 1,2,3,4};
		int y[] = {5,6,7,8};
		int z[] = { 9,10};
		List<int[]> listOfArrays = Arrays.asList(x,y,z);
		for ( int p[] : listOfArrays)
		{
			System.out.println(Arrays.toString(p));
		}
		
		
		
		
		
		
		
		
	}
}
