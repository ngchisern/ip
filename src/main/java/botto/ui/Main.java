package botto.ui;

import java.io.IOException;

import botto.Botto;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    private Botto botto = new Botto();

    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/MainWindow.fxml"));
            AnchorPane ap = fxmlLoader.load();
            Scene scene = new Scene(ap);
            stage.setScene(scene);
            fxmlLoader.<MainWindow>getController().setBotto(botto);
            stage.setResizable(false);
            stage.setTitle("Botto");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
