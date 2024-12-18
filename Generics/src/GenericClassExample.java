
// This is generic class -- T
// Generics works only with Objects

class Demo<T>
{
	private T content;

	public T getContent() {
		return content;
	}
	public void setContent(T content) {
		this.content = content;
	}
	public Demo(T content) {
		super();
		this.content = content;
	}	
	
}

class Student
{
	private int roll;
	private String name;
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	
	
}

// class with two generic types
class Gen<T1,T2>
{
	private T1 x;
	private T2 y;
	
	@Override
	public String toString() {
		return "Gen [x=" + x + ", y=" + y + "]";
	}

	public Gen(T1 x, T2 y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	
}
public class GenericClassExample {
	
	public static void main(String[] args) {
		
		Demo<Integer> intDemo = new Demo<Integer>(100);
		System.out.println(intDemo.getContent());
		
		Demo<String> stringDemo = new Demo<>("This is String");
		System.out.println(stringDemo.getContent());
		
		Student s = new Student(10,"Suresh");
		Demo<Student> studentDemo = new Demo<>(s);
		System.out.println(studentDemo.getContent());
		
		Gen<String,Integer> g1 = new Gen<>("XYZ", 100);
		System.out.println(g1);
		
		
		
		
		
	}

}
