package com.face.inheritance;

//Student is the child class and should extend User
//extends is the keyword to inherit from parent
public class Student extends User {
	//define the specific properties of a student;
	private int roll;
	private float cgpa;
	private String dept;
	private int year;
	
	
	public Student(String firstname, String lastname, int age, String email, String mobile, int roll, float cgpa,
			String dept, int year) {
		super(firstname,lastname,age,email,mobile);
		this.roll=roll;
		this.cgpa=cgpa;
		this.dept=dept;
		this.year=year;
		
	}
public void display() {
	super.display();// call the display method in parent class
	System.out.println(this.roll);
	System.out.println(this.cgpa);
	System.out.println(this.dept);
	System.out.println(this.year);
}
	
}
