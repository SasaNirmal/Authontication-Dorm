package Controllers;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.SQLException;

public class CustermerTableControllers {
    public TableView<CustemerTM> tblcstmr;
    public TextField txtID;
    public TextField txtcntct;
    public TextField txteml;
    public TextField txtnm;

    public void initialize(){
        tblcstmr.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("ID"));
        tblcstmr.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("name"));
        tblcstmr.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("email"));
        tblcstmr.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("contact"));

        loadStartCustemerData();
        tblcstmr.refresh();

        tblcstmr.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<CustemerTM>() {
            @Override
            public void changed(ObservableValue<? extends CustemerTM> observableValue, CustemerTM custemerTM, CustemerTM t1) {
                CustemerTM selectedItem = tblcstmr.getSelectionModel().getSelectedItem();

                txtID.setText(selectedItem.getID());
                txtnm.setText(selectedItem.getName());
                txteml.setText(selectedItem.getEmail());
                txtcntct.setText(selectedItem.getContact());

            }
        });
    }

    public void loadStartCustemerData(){
        CustemerTM cstmr1 = new CustemerTM("C001","Kasun","kasun@gmail.com","0771234567");
        CustemerTM cstmr2 = new CustemerTM("C002","Nirmal","nirmal@gmail.com","0781234567");
        CustemerTM cstmr3 = new CustemerTM("C003","Sasanka","sasa@gmail.com","0731234567");
        CustemerTM cstmr4 = new CustemerTM("C004","Gayan","gayan@gmail.com","0776234567");
        CustemerTM cstmr5 = new CustemerTM("C005","Pasan","pasan@gmail.com","0777234567");

        ObservableList<CustemerTM> items = tblcstmr.getItems();

        items.add(cstmr1);
        items.add(cstmr2);
        items.add(cstmr3);
        items.add(cstmr4);
        items.add(cstmr5);
    }

    public void btnCustemerAddOnAction(ActionEvent actionEvent) {

        String id = txtID.getText();
        String contact = txtcntct.getText();
        String email = txteml.getText();
        String name = txtnm.getText();

        ObservableList<CustemerTM> custemer = tblcstmr.getItems();

        CustemerTM newcustemer = new CustemerTM(id, name, email, contact);

        custemer.add(newcustemer);
        tblcstmr.refresh();
        txtID.clear();
        txtcntct.clear();
        txteml.clear();
        txtnm.clear();
        txtID.requestFocus();
    }
}
