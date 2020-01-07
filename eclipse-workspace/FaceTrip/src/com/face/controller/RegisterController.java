package com.face.controller;


import java.time.LocalDate;

import java.time.format.DateTimeFormatter;


import com.face.model.Person;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.StringConverter;

public class RegisterController {
	@FXML
	private TextField firstname;
	@FXML
	private TextField lastname;
	@FXML
	private TextField username;
	@FXML
	private PasswordField password;
	@FXML
	private TextField email;
	@FXML
	private TextField mobile;
	@FXML
	private TextField empid;
	@FXML
	private DatePicker dob;
	@FXML
	private Label lblstatus;
	@FXML
	private Button signup;

	@FXML
	public void register(ActionEvent event) {
		String fname=firstname.getText();
		String lname=lastname.getText();
		String user=username.getText();
		String pass=password.getText();
		String eml=email.getText();
		String mob=mobile.getText();
		String emp=empid.getText();
		LocalDate date=dob.getValue();
		String dob = null;
		if(date==null)
		{
			lblstatus.setText("Enter Proper date");
		}
		else{
			dob=String.valueOf(date);
		}
		
		Stage primaryStage=new Stage();
		Person person=new Person();
		person.setFirstname(fname);
		person.setLastname(lname);
		person.setUsername(user);
		person.setPassword(pass);
		person.setEmail(eml);
		person.setMobile(mob);
		person.setEmpid(emp);
		person.setDob(dob);
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(user);
		System.out.println(pass);
		System.out.println(eml);
		System.out.println(mob);
		System.out.println(emp);
		System.out.println(dob);
		lblstatus.setText("Registration Successful");
		try {
		Parent root=FXMLLoader.load(getClass().getResource("/com/face/view/WelcomeWindow.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
}
