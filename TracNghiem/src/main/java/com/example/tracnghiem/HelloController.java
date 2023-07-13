package com.example.tracnghiem;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class HelloController {

    @FXML
    RadioButton dapAnDung;
    @FXML
    RadioButton sai;
    @FXML
    RadioButton dapAnSai;
    @FXML
    ToggleGroup cauhoi;

    @FXML
    protected void nopBai() {
        int diem = 0;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        if (dapAnDung.isSelected()) {
            diem++;
            alert.setContentText("So diem cua ban la: " + diem);
            alert.show();
        } else if (dapAnSai.isSelected()) {
            alert.setContentText("chon sai roi");
            alert.show();
        } else if(sai.isSelected()){
            alert.setContentText("chon sai roi");
            alert.show();
        }else {
            alert.setContentText("chon dap an di");
            alert.show();
        }


    }
}