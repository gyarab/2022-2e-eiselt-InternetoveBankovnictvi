package com.example.atm.Ovladani.Klient;

import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class OvladaciPanel implements Initializable {
    public Text prihlasovaci_jmeno;
    public Label prihlaseni_datum;
    public Label bezny_zustatek;
    public Label bezny_ucet_cislo;
    public Label sporici_zustatek;
    public Label sporici_ucet_cislo;
    public Label prijem_lbl;
    public Label vydaje_lbl;
    public ListView platby_list;
    public TextField prijemce_field;
    public TextField castka_field;
    public TextArea zprava_field;
    public Button odeslat_platbu_button;

    @Override
    public void initialize (URL url, ResourceBundle resourceBundle) {

    }
}
