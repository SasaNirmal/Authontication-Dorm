package Controllers;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class CustermerTableControllers {
    public TableView<CustemerTM> tblcstmr;
    public TextField txtID;
    public TextField txtcntct;
    public TextField txteml;
    public TextField txtnm;

    public void btnCustemerAddOnAction(ActionEvent actionEvent) {

        String id = txtID.getText();
        String contact = txtcntct.getText();
        String email = txteml.getText();
        String name = txtnm.getText();

        ObservableList<CustemerTM> custemer = tblcstmr.getItems();

        CustemerTM newcustemer = new CustemerTM(id, contact, email, name);

        custemer.add(newcustemer);

    }
}
