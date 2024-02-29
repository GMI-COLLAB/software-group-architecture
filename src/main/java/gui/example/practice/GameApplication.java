package gui.example.practice;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class GameApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GameApplication.class.getResource("menu-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        // Corrected file URL with forward slashes
        Image icon = new Image("file:/C:/Users/moham_my0tjcn/IdeaProjects/Practice/src/main/icon.png");
        stage.getIcons().add(icon);
        stage.setTitle("Travelling Salesman");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
