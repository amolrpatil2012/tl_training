/*
 * 		Inheritance
 * 		|
 * 		Super classes		General Idea
 * 		Sub classes			Specific Implementations
 * 
 * 	super keyword -- to refer super class members
 * 
 * 		mostly super classes are always abstract 
 * 		and it is always responsibility of sub classes to define
 * 		abstract methods of super classes
 * 
 * 
 * 		Polymorphism	
 * 		|
 * 		One Name Many Forms [ define more than one functions with same name ]
 * 
 * 		1. Function Overloading / Compile time polymorphism
 * 		
 * 			void show()	
 * 			void show(int x)
 * 			void show(String s)
 * 			void show(int x, int y)
 * 			
 */

// Abstract class is a class which contains one/more abstract methods
abstract class Emp
{
	private String name;
	private double salary;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Emp ( String name , double salary)
	{
		this.name = name;
		this.salary = salary;
	}
	
	public Emp ( String name )	// Function Overloading
	{
		this.name = name;
		this.salary = 40000;
		
	}
	
	// Abstract method -- function without body	
	public abstract double finalSalary();
	
	
	
}
class PermanentEmp extends Emp
{
	public PermanentEmp(String name, double salary) {
		super(name, salary);		
	}
	public PermanentEmp(String name) {
		super(name);		
	}
	@Override
	public double finalSalary()
	{
		return getSalary()+10000;
	}
	
}
class ContractEmp extends Emp
{
	public ContractEmp(String name, double salary) {
		super(name, salary);		
	}
	public ContractEmp(String name) {
		super(name);		
	}
	@Override
	public double finalSalary()
	{
		return getSalary()+5000;
	}
	
}
class ExternalEmp extends Emp
{
	public ExternalEmp(String name, double salary) {
		super(name, salary);		
	}
	public ExternalEmp(String name) {
		super(name);		
	}
	@Override
	public double finalSalary()
	{
		return getSalary()+3000;
	}
	
}
public class OOPDemo {
	
	// We can not create an Object of Emp class cause abstract class
	// Emp e = new Emp ---> error
	// Emp e = new PermanatEmp();
	
	// Demo d= new Demo();
	
	public static void printSalary ( Emp emp )	// emp is a super class reference variable
	{
		System.out.println(" Name : " + emp.getName());
		System.out.println( " Salary : " + emp.getSalary());
		System.out.println( " Final Salary : " + emp.finalSalary());
	}
	
	
	public static void main(String[] args) {
		
		printSalary ( new PermanentEmp("Suresh", 50000));	// Emp emp = new PermananetEmp()
		printSalary ( new ContractEmp("Ramesh", 20000));
		printSalary ( new ExternalEmp("Rohit", 10000));
		
	

	}
	
	
	
	
	
	

}

interface A
{
	
}
class B implements A
{
	
}
A t = new B();







