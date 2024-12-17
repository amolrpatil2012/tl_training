
public class ObjectDemo {

	public static void main(String[] args) {
		
		// Create Object Of Rect class
		// t is a Reference Variable refers to object
		Rect t = new Rect(10,20);			// [][][][][] <------t
		
		System.out.println("Length : " + t.getLength());
		System.out.println("Width : " + t.getWidth());
		System.out.println("Area : " + t.area());
		
		
		Rect t1;
		t1 = new Rect(20);
		
		
	}
}
