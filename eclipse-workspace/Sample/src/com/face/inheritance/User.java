package com.face.inheritance;

//This is the parent class
public class User {

	// define the properties of a user
// common properties can be defined in parent class
	private String firstname;
	private String lastname;
	private int age;
	private String email;
	private String mobile;
	public User(String firstname, String lastname, int age, String email, String mobile) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.age=age;
		this.email=email;
		this.mobile=mobile;
	}
	// now create a display method
	public void display() {
		System.out.println(this.firstname);
		System.out.println(this.lastname);
		System.out.println(this.age);
		System.out.println(this.email);
		System.out.println(this.mobile);
	}
}
