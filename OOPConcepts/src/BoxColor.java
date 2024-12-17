
// Rect ---> Box ---> BoxColor			Multilevel

public class BoxColor extends Box {
	
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public BoxColor ( int length , int width , int height , String color)
	{
		super ( length , width , height);	/// super class -- Box
		this.color = color;
	}

}
