package com.face.inheritance;

import java.util.Scanner;

//Main Class acting as driver stub
public class InheritanceExample {

	public static void main(String[] args) {
		
		String firstname;
		String lastname;
		String email;
		String mobile;
		int age;
		int roll;
		float cgpa;
		Scanner sc=new Scanner(System.in);
		firstname=sc.next();
		lastname=sc.next();
		email=sc.next();
		mobile=sc.next();
		age=sc.nextInt();
		roll=sc.nextInt();
		cgpa=sc.nextFloat();
		StudentClass student=new StudentClass(firstname,lastname,email,mobile,age,roll,cgpa);
		student.display();
		
	}

}
