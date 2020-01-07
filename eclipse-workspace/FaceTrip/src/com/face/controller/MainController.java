package com.face.controller;

import java.io.IOException;

import com.face.model.Person;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController {
	
	
	
	@FXML
	private Label lbluser;
	@FXML
	private Label lblpass;
	@FXML
	private Label lblstatus;
	@FXML
	private TextField username;
	@FXML
	private TextField password;
	@FXML
	private Button signin;
	@FXML
	private Button signup;
	
	
	@FXML
	public void signIn(ActionEvent event) {
		Person person=new Person();
		System.out.println(person.getUsername());
		System.out.println(person.getPassword());
		if(username.getText().equals(person.getUsername())&& password.getText().equals(person.getPassword())) {
			lblstatus.setText("Login Successful");
			Stage primaryStage=new Stage();
			try {
				Parent root=FXMLLoader.load(getClass().getResource("/com/face/view/PersonOverview.fxml"));
				Scene scene = new Scene(root);
				primaryStage.setScene(scene);
				primaryStage.show();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		else
		{
			lblstatus.setText("Login Failed");
		}
	}
	@FXML
	public void clickSignUp(ActionEvent event) {
		Stage primaryStage=new Stage();
		try {
			
			Parent root=FXMLLoader.load(getClass().getResource("/com/face/view/RegistrationWindow.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Registration");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
}
