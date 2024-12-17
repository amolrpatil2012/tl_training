/* Rules to Design class
 * 
 * 1. Java class name must follow - first letter of every word must be capital
 * 2. Define class in separate file
 * 3. All properties must be private
 * 4. Define public getter/setter methods for properties
 * 5. Define constructors as per requirements
 * 6. Define utility methods  
 * 
 */


public class Rect {
	/*
	 *  To generate getter-setter methods and constructor
	 *  Using eclipse IDE 
	 *  
	 *  right click - source
	 */	
	
	private int length,width;
	
	
	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}

	/*
	 * Constructor Method
	 * 
	 * 	1. Class name and constructor name must be same
	 *  2. Constructor not return any value
	 *  3. No explicit call
	 *  4. Can overload constructor
	 * 
	 */
	
	public Rect(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	

	public Rect ( int dim)
	{
		this.length = this.width = dim;
	}

	// utility method
	public int area()
	{
		return length * width;
	}
	
	

}
