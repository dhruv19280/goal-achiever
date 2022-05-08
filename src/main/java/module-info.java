module com.example.goalachiever {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires eu.hansolo.tilesfx;

    opens com.example.goalachiever to javafx.fxml;
    exports com.example.goalachiever;
}