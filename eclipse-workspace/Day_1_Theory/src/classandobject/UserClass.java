package classandobject;

//Create a class called as UserClass
// Define the properties of UserClass

public class UserClass {

	//Properties
	String firstname;
	String lastname;
	String username;
	String password;
	String email;
	String mobile;
	
	//Constructor helps in assigning values to an object
	public UserClass(String firstname, String lastname, String username, String password, String email,
			String mobile) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.username=username;
		this.password=password;
		this.email=email;
		this.mobile=mobile;
	}
	
	public void display() {
		System.out.println("Firstname "+ this.firstname);
		System.out.println("Lastname "+ this.lastname);
	}
}
