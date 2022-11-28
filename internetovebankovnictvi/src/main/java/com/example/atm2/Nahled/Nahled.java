package com.example.atm2.Nahled;

import com.example.atm2.Ovladani.Klient.OvladaniKlient;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Nahled {
    private AnchorPane ovladaciPanel;

    public Nahled() {}

        public AnchorPane getOvladaciPanel () {
            if (ovladaciPanel == null) {
                try {
                    ovladaciPanel = new FXMLLoader(getClass().getResource("/FXml/Klient/OvladaciPanel.fxml")).load();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return ovladaciPanel;
        }
        public void showPrihlasovaciOkno () {
            FXMLLoader nacteni = new FXMLLoader(getClass().getResource("/FXml/Prihlaseni.fxml"));
            vytvorStage(nacteni);
        }
        public void  showKlientOkno() {
            FXMLLoader nacteni = new FXMLLoader(getClass().getResource("/FXml/Klient/Klient.fxml"));
            OvladaniKlient ovladaniKlient = new OvladaniKlient();
            nacteni.setController(ovladaniKlient);
            vytvorStage(nacteni);
            /*vytvorStage(nacteni);*/
        }

    private void vytvorStage(FXMLLoader nacteni) {
        Scene scena = null;
        try {
            scena = new Scene(nacteni.load());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(scena);
        stage.setTitle("Fleeca Bank");
        stage.show();
    }
       /* private void vytvorStage(FXMLLoader nacteni) {
            Scene scena = null;
            try {
                scena = new Scene(nacteni.load());
            }
            catch(Exception e ) {
               e.printStackTrace();
            }
            Stage stage = new Stage();
            stage.setScene(scena);
             stage.setTitle("Fleeca Bank");
            stage.show();
           } */
}
