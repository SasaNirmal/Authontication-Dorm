package Controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SignUpControllers {
    public TextField txtSAddress;
    public TextField txtEMail;
    public TextField txtFName;
    public TextField txtLName;
    public TextField txtSAddress2;
    public TextField txtCity;
    public TextField txtState;
    public TextField txtZCode;
    public Label lblDetailsShow;
    public Button btnSubmit;

    public void btnSubmit(ActionEvent actionEvent) {
        String details = "First Name : "+txtFName.getText()+"\nLast Name : "+txtLName.getText()+"\nEmail : "+txtEMail.getText()+"\nAddress 1 : "+txtSAddress.getText()+"\nAddress 2 : "+txtSAddress2.getText()+"\nCity : "+txtCity.getText()+"\nState : "+txtState.getText()+"\nZip Code : "+txtZCode.getText();
        lblDetailsShow.setText(details);

    }
}
