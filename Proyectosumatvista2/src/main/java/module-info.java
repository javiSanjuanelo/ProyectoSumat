module com.example.java10 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java10 to javafx.fxml;
    exports com.example.java10;
}