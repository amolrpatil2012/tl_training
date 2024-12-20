import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class PredicateAsArgumentExample {
	
	public static boolean filter ( Predicate<Integer> predicate , int n)
	{
		return predicate.test(n);
	}
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 12,45,32,67,45,78);
		
		for( Integer i : list)
		{
			if ( filter ( n->n%2==0 , i))
				System.out.println(i);
		}
		
	}

}
