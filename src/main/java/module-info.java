module com.arpaspeter.arpaspeter_javafxrestclient {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.arpaspeter.arpaspeter_javafxrestclient to javafx.fxml;
    exports com.arpaspeter.arpaspeter_javafxrestclient;
}