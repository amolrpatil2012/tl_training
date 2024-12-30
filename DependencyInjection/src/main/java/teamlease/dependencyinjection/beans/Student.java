package teamlease.dependencyinjection.beans;

// POJO Class

public class Student {
	
	private int roll;
	private String name;
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
		
		System.out.println("Inside Parameterized Constructor");
	}
	
	public Student() {
		
		System.out.println("Inside Default Constructor");
	}
	
	
}