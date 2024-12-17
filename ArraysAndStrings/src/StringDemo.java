/*
 * 		Strings are immutable [ can not change content of string ]
 * 
 * 		Strings are constant; their values cannot be changed after they are created. 
 * 		String buffers support mutable strings
 * 
 * 		We can create strings with changes using StringBuffer class
 * 
 * 		String			--->	Expected when string is constant
 * 		StringBuffer	---> 	Expected when length of String is changing
 * 
 */
public class StringDemo {

	public static void main(String[] args) {
		
		
		String s = "Hello";							// String Literal
		
		String s1 = new String("Hello");			// String Object	
		
		char c[]  = { 'H' , 'e' , 'l' ,'l' ,'o'};
		String s2 = new String(c);					// String from char array
		
		byte b[] = { 65,66,67,68};
		String s3 = new String(b);					// "ABCD"
		
		
		// length() -- returns length of string
		
		System.out.println( " Length : " + s.length());		// 5
		
		// charAt ( int index ) --- char at given index
		
		System.err.println( " Char At 2 " + s.charAt(2));	// l
		
		// indexOf ( char c ) -- returns index of given char
		
		System.out.println( " Index Of o " + s.indexOf('o'));	// 4
		
		// toLowerCase - toUpperCase
		
		System.out.println( s.toUpperCase());		// HELLO
		
		// substring 
		
		System.out.println( s.substring(2));        //   llo
		
		// if s>demo will return + value
		// if demo > s will return - value
		// if both are same will return 0
		System.out.println(s.compareTo("demo"));
		
		System.out.println(s.compareToIgnoreCase("hello"));	// 0
		
		System.out.println(s.equals("Hello"));		// true
		
		
		
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append(" ");
		sb.append("World");
		System.out.println(sb);		
		sb.delete(5, 10);				
		System.out.println(sb);
		
		
		
		// String Concatnation Operator +
		
		String ss = "Hello";			/// this is first object
		ss = ss + " ";					/// this will create new object
		ss = ss + "World";				/// this will create new object
		System.out.println(ss);			/// this is inefficient
		
		
		
	}
}
