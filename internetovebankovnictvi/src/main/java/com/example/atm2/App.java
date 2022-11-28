package com.example.atm2;

import com.example.atm2.Modely.Modely;
import com.example.atm2.Nahled.Nahled;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        Modely.getInstance().getNahled().showPrihlasovaciOkno();
    }
}
