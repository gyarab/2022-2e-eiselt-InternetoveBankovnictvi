package com.example.atm2.Ovladani.Klient;

import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class OvladaniOvladaciPanel implements Initializable {
    public Text prihlasovaci_jmeno;
    public Label prihlaseni_datum;
    public Label bezny_zustatek;
    public Label bezny_ucet_cislo;
    public Label sporici_zustatek;
    public Label sporici_ucet_cislo;
    public Label prijem_label;
    public Label vydaje_label;
    public ListView platby_list;
    public TextField prijemce_field;
    public TextField castka_field;
    public TextArea zprava_field;
    public Button odeslat_platbu_button;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
