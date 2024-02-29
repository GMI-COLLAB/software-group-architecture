package gui.example.practice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class GameController {
    private Stage stage;
    private Parent root;
    private Scene main;


    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void switchSceneToMain(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("game-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        main = new Scene(root);
        stage.setScene(main);
        stage.show();
    }

    @FXML
    protected void switchSceneToHelp(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("help-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        main = new Scene(root);
        stage.setScene(main);
        stage.show();
    }

    @FXML
    protected void switchSceneToMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("menu-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        main = new Scene(root);
        stage.setScene(main);
        stage.show();
    }

    @FXML
    protected void endGame(ActionEvent event) throws IOException{
        System.exit(0); // Exit the program
    }

}