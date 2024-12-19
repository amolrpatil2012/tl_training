import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LibFunctionalInterfaceExample {
	public static void main(String[] args) {
		
		// Consumer --> (takes one argument)-> not return anything
		Consumer<String> consumer = (s)->System.out.println(s);
		consumer.accept("Hello");
		
		// Supplier --> (no argument) -> returns something
		Supplier<String> supplier = ()-> "Hello World";
		System.out.println(" Supplier Demo " + supplier.get());
		
		// Predicate --> (takes one argument) --> returns boolean
		Predicate<Integer> checkEven = (n)->n%2==0;
		if ( checkEven.test(10))
			System.out.println("No is Even");
		
		// Function ---> ( takes one argument) --> return something
		Function<String, String> str = (s)->s.toLowerCase();
		System.out.println(str.apply("HELLO"));
		
	}

}
