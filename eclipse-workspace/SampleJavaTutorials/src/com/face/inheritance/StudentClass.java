package com.face.inheritance;

public class StudentClass extends UserClass {
	private String firstname;
	private String lastname;
	private int roll;
	private float cgpa;
	
	
	public StudentClass(String firstname, String lastname, String email, String mobile, int age, int roll,
			float cgpa) {
		super(firstname,lastname,email,mobile,age);//super is a keyword which refers to parent class
		this.roll=roll;	 // this refers to current class object
		this.cgpa=cgpa; 	
	}
public void display() {
	super.display();
	System.out.println("Roll"+this.roll);
	System.out.println("Cgpa"+this.cgpa);
}
}
