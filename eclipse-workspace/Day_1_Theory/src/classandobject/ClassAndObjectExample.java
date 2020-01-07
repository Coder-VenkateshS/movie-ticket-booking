package classandobject;

import java.util.Scanner;

//To access the facebook you need to create an object 

public class ClassAndObjectExample {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		String firstname = sc.next();
		String lastname= sc.next();;
		String username= sc.next();;
		String password= sc.next();;
		String email= sc.next();;
		String mobile = sc.next();
		
		// Let us create an object for the class User
		// Syntax is Class_name obj_name=new Constructor();
		//Let us assign values to the user
		UserClass user=new UserClass(firstname,lastname,username,password,email,mobile);
		user.display();

	}

}
