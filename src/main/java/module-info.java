module com.example.opusreg {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;


    opens com.example.opusreg to javafx.fxml;
    exports com.example.opusreg;
}