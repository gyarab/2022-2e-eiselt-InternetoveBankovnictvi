module com.example.atm_2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.atm to javafx.fxml;
    exports com.example.atm;

    exports com.example.atm.Ovladani;
    exports com.example.atm.Ovladani.Klient;
    exports com.example.atm.Modely;
    exports com.example.atm.Nahled;

}