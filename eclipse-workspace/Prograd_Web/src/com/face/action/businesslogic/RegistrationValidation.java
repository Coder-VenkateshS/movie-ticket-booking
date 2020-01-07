package com.face.action.businesslogic;

public class RegistrationValidation {

	public boolean validate(String firstname,String lastname,String username,String password, String confirmpassword,String email,String mobile) {
		
		System.out.println("Welcome to validation");
		if(is_Valid_Password(password,username) && is_Valid_Email(email) && is_Valid_Mobile(mobile))
		return true;
		else
			return false;
	
		
	
	}
	
	 public boolean is_Valid_Mobile(String mobile) {
		
		return true;
	}

	public boolean is_Valid_Email(String email) {
		
		return true;
	}


	public boolean is_Valid_Password(String password,String username) {
	
		  boolean valid = true;
          if (password.length() > 15 || password.length() < 8)
          {
                  System.out.println("Password should be less than 15 and more than 8 characters in length.");
                  valid = false;
          }
          if (password.indexOf(username) > -1)
          {
                  System.out.println("Password Should not be same as user name");
                  valid = false;
          }
          String upperCaseChars = "(.*[A-Z].*)";
          if (!password.matches(upperCaseChars ))
          {
                  System.out.println("Password should contain atleast one upper case alphabet");
                  valid = false;
          }
          String lowerCaseChars = "(.*[a-z].*)";
          if (!password.matches(lowerCaseChars ))
          {
                  System.out.println("Password should contain atleast one lower case alphabet");
                  valid = false;
          }
          String numbers = "(.*[0-9].*)";
          if (!password.matches(numbers ))
          {
                  System.out.println("Password should contain atleast one number.");
                  valid = false;
          }
          String specialChars = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
          if (!password.matches(specialChars ))
          {
                  System.out.println("Password should contain atleast one special character");
                  valid = false;
          }
          if (valid)
          {
                  System.out.println("Password is valid.");
                
          }
		return valid;
		
		
		
		/*    boolean valid=false;   
	    char splchar[]= {'@','!','_','#','$','%','^','&','*','(',')','_'};
		if (password.length()>8 && password.length()<=15)
			valid=true;
			for(int i=0;i<password.length();i++) {
			char ch=password.charAt(i);
			if((ch>='A' && ch<='Z'))
			{
				valid=true;
			}
			if(ch>='a' && ch<='z')
			{
				valid=true;
			}
			if(ch >= '0' && ch <= '9')
			{
				valid=true;
			}
			if(ch=='@'||ch=='!'||ch=='_'||ch=='#') {
				valid=true;
			}
			
		}
		return valid;
		*/		
	}			
	
}
