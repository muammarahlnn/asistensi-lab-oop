module com.example.kalkulator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.kalkulator to javafx.fxml;
    exports com.example.kalkulator;
}