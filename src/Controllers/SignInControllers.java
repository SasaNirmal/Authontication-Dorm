package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class SignInControllers {
    public TextField txtPassword;
    public TextField txtLogEMail;
    public Label lblDetailsShow;

    public void btnLogIn(ActionEvent actionEvent) {
        System.out.println("LogIn");
    }

    public void btnSaveUserOnAction(ActionEvent actionEvent) {
        System.out.println("SaveUser");
    }

    public void btnForgotPasswordOnAction(ActionEvent actionEvent) {
        System.out.println("ForgotPassword");
    }

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("View/DashBourd.fxml"));
        Scene scene = new Scene(parent);
    }
}
