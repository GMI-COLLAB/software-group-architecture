module gui.example.practice {
    requires javafx.controls;
    requires javafx.fxml;


    opens gui.example.practice to javafx.fxml;
    exports gui.example.practice;
}