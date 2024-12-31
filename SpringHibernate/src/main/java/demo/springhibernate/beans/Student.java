package demo.springhibernate.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// to map this class to database table

@Entity
public class Student {
	
	// to map this property to primary key of table
	@Id
	private int roll;
	private String firstname;
	private String lastname;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Student(int roll, String firstname, String lastname) {
		super();
		this.roll = roll;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public Student() {
		
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	
	

}
