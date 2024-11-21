package br.edu.ifsp.campominado.app2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 1280, 960 );
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        String caminho = "/br/edu/ifsp/campominado/fxml/" + fxml + ".fxml";
        URL arquivo = App.class.getResource( caminho );
        FXMLLoader fxmlLoader = new FXMLLoader( arquivo );
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}