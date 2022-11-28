package com.example.atm2.Ovladani;

import com.example.atm2.Modely.Modely;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class OvladaniPrihlaseni implements Initializable {
    public ChoiceBox ucet_volba;
    public Label bankovni_adresa_label;
    public TextField bankovni_adresa_pole;
    public TextField heslo_pole;
    public Button prihlaseni_button;
    public Button registrace_button;
    public Label error_label;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        prihlaseni_button.setOnAction(event -> Modely.getInstance().getNahled().showKlientOkno());
    }

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void prepniPrihlaseni(ActionEvent e) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Main.fxml")));
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root, 1080, 720);
        stage.setScene(scene);
        stage.show();
    }
}
