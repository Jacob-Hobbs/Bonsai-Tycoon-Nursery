module com.example.bonsaitycoon {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bonsaitycoon to javafx.fxml;
    exports com.example.bonsaitycoon;
    exports controller;
    opens controller to javafx.fxml;
}