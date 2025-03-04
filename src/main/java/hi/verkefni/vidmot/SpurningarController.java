package hi.verkefni.vidmot;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SpurningarController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onSvar() {

    }

    /**
     * Skiptir yfir í kveðjuskjá.
     */
    @FXML
    private void onKvedja() {
        ViewSwitcher.switchTo(View.KVEDJA);
    }

    /**
     * Skiptir yfir í velkominn skjá.
     */
    @FXML
    private void onVelkominn() {
        ViewSwitcher.switchTo(View.VELKOMINN);
    }
}