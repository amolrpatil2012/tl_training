
public class GenericMethodExample {
	
	// swap will only work with Objects
	
	public static <T> void display ( T a , T b)
	{
		System.out.println( " value of a :"+a);
		System.out.println( " value of b :"+b);
	}
	
	public static void main(String[] args) {
		
		double d1 = 100 , d2 = 200;
		display(d1,d2);					// double ---> Double  boxing
		
		String s1 = "demo" , s2 = "xyz";
		display(s1,s2);
		
	}

}
