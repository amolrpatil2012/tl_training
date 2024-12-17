
public class InheritanceDemo {

	public static void main(String[] args) {
		
		BoxColor b = new BoxColor(10,20,10,"Red");
		System.out.println(" Area of Box : " + b.area());
		System.out.println( " Volume of Box : " + b.volume());
		System.out.println(" Color of Box : " + b.getColor());
	}
}
