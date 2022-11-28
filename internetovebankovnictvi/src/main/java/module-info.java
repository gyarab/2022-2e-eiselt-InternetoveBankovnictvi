module com.example.atm2 {
    requires javafx.controls;
    requires javafx.fxml;


    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.atm2 to javafx.fxml;
    exports com.example.atm2;

    exports com.example.atm2.Ovladani;
    exports com.example.atm2.Ovladani.Klient;
    exports com.example.atm2.Modely;
    exports com.example.atm2.Nahled;

}