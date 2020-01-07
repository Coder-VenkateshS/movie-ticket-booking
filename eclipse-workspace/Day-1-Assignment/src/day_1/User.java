package day_1;


//syntax for creating a class
// class ClassName(Pascal case)
public class User {

	String firstname;
	String lastname;
	String username;
	String password;
	
	//Define the constructor which is exactly similar to my class name but it does not have any return type
	public User(String foo) {
		this.firstname=foo;
		
	}
	public User(String firstname,String lastname) {
		this.firstname=firstname;
		this.lastname=lastname;
	}
	public User(String firstname,String lastname,String username) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.username=username;
	}

	public void display() {
		System.out.println("Firstname "+this.firstname);
		System.out.println("Lastname "+this.lastname);
		System.out.println("Username "+this.username);
	}
}
