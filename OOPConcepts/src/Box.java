
// Box is a sub class [ child ] of Rect [ super class / parent ]

// When super class contains parameterized constructor then sub class must call super class constructor

// super keyword --- used to refer super class

public class Box extends Rect{
	
	private int height;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public Box ( int length , int width , int height)
	{
		super(length,width);		// calling super class constructor
		this.height = height;
	}

	public int volume()
	{
		return area()*height;
	}
}
