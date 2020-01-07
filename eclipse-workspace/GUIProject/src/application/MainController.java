package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
	@FXML
	private Label lbluser;
	@FXML
	private Label lblpass;
	@FXML
	private Label status;
	@FXML
	private TextField username;
	@FXML
	private TextField password;
	
	public void login(ActionEvent event) {
		if(username.getText().equals("admin")&&password.getText().contentEquals("admin")) {
		status.setText("login successful");
	}else {
			status.setText("login failed");
	}
	}
	
}
