package hi.verkefni.vidmot;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class ViewSwitcher {

    private static Scene scene;

    /**
     * Setur senu sem á að nota
     *
     * @param scene sena sem á að nota
     */
    public static void setScene(Scene scene) {
        ViewSwitcher.scene = scene;
    }

    /**
     * Skiptir um senu.
     *
     * @param view Útlitið sem á að skipta í.
     */
    public static void switchTo(View view) {
        if (scene == null) {
            System.out.println("No scene was set");
        }

        try {
            Parent root = FXMLLoader.load(
                    ViewSwitcher.class.getResource(view.getFileName())
            );

            scene.setRoot(root);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
