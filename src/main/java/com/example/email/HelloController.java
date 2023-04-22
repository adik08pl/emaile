package com.example.email;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {

    public TextArea txtTresc;
    public TextField txtOdbiorca;
    public TextField txtTytul;

    public void btnWyslijClicked(ActionEvent actionEvent) {
        String odbiorca = txtOdbiorca.getText();
        String tytul = txtTytul.getText();
        String tresc = txtTresc.getText();

    }
}