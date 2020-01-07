// 
package day_1;

import java.util.Scanner;

class Main {
// Access modifier 
	// public private protected default 
	// visibility of your class file 
	// private is only me
	// Protected can be used between a parent and child
	// public can be accessed by any class
	// default can be all classes within the same example
	// Static Modifier
	// static --> I need not define or create an object 
	// void --> hw--> os --> jvm -->  java exe
	// String args --> command line args or system arg( memory , maxheap or minheap) 
	// main would be start of your application 
	
	public static void main(String[] args) {
		// Create an Object of type User
		// Syntax : Classname obj_name=new Constructor();
		
		Scanner sc=new Scanner(System.in);
		String firstname=sc.next();
		String lastname=sc.next();
		String username=sc.next();
		String password=sc.next();
		
		User user=new User(firstname);
		User user1=new User(firstname,lastname);
		User user2=new User(firstname,lastname,username);
		User.display();
			user1.display();
			user2.display();

	}
	
	
	

}
