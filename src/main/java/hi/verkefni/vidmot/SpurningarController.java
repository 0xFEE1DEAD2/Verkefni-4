package hi.verkefni.vidmot;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SpurningarController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onSvar() {

    }

    @FXML
    private void onKvedja() {
        ViewSwitcher.switchTo(View.KVEDJA);
    }

    @FXML
    private void onVelkominn() {
        ViewSwitcher.switchTo(View.VELKOMINN);
    }
}