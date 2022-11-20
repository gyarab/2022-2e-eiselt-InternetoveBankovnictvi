package com.example.atm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class App extends Application {
    @Override

    public void start(Stage stage) throws IOException {

        Scene scene = new Scene (FXMLLoader.load(getClass().getResource("/FXml/Prihlaseni.fxml")));
        stage.setScene(scene);
        stage.show();

    }
}
