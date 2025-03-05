module com.acpt.demofx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.acpt.demofx to javafx.fxml;
    exports com.acpt.demofx;
}