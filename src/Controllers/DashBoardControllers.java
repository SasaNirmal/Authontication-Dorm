package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashBoardControllers {
    public AnchorPane root;

    public void btnSignUpOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("../View/SignUp.fxml"));
        Scene signUpScene = new Scene(parent);

        Stage signUpStage =  (Stage) this.root.getScene().getWindow();

        signUpStage.setScene(signUpScene);
        signUpStage.centerOnScreen();
        signUpStage.setTitle("Sign Up");
    }

    public void btnSignInOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("../View/SignIn.fxml"));
        Scene signInScene = new Scene(parent);

        Stage signUpStage =  (Stage) this.root.getScene().getWindow();

        signUpStage.setScene(signInScene);
        signUpStage.centerOnScreen();
        signUpStage.setTitle("Sign In");
    }
}
