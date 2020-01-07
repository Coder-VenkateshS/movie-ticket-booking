package com.face.inheritance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// get inputs here and pass to the child class
		
		String firstname;
		String lastname;
		int age;
		String email;
		String mobile;
		int roll;
		float cgpa;
		String dept;
		int year;
		
		// create an object for scanner class and get inputs
		Scanner sc=new Scanner(System.in);
		firstname=sc.next();
		lastname=sc.next();
		age=sc.nextInt();
		email=sc.next();
		mobile=sc.next();
		roll=sc.nextInt();
		cgpa=sc.nextFloat();
		dept=sc.next();
		year=sc.nextInt();
		//create an object for Student class and pass the parameters in constructor
		Student student = new Student(firstname,lastname,age,email,mobile,roll,cgpa,dept,year);
		// call the display method in child class
		student.display();
		
		

	}

}
