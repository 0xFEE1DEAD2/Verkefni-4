package hi.verkefni.vidmot;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class InterviewApplication extends Application {

    /**
     * Upphafstillir JavaFX og skiptir yfir í velkominn senu.
     *
     * @param stage Aðalsvið.
     * @throws IOException Ef villa kemur upp við hleðslu á útliti.
     */
    @Override
    public void start(Stage stage) throws IOException {
        var scene = new Scene(new Pane());

        ViewSwitcher.setScene(scene);
        ViewSwitcher.switchTo(View.VELKOMINN);

        stage.setScene(scene);
        stage.show();
    }

    /**
     * Keyrir forrit.
     *
     * @param args Keyrsla.
     */
    public static void main(String[] args) {
        launch();
    }
}