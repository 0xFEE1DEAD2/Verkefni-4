package hi.verkefni.vidmot;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;

import java.io.IOException;

/**
 * Hérna byrjaði allt að fara úrskeiðis, ég var ekki að skilja þennan hluta vel.
 */
public class SvarDialogController extends Dialog<String> {

    /**
     * Smiður sem upphafstillir svar glugga?
     *
     * @param selectedItem hlutur sem notandi velur?
     */
    public SvarDialogController(String selectedItem) {
        setDialogPane(lesaSvarDialog());
    }

    /**
     * Hleður inn fxml skrá fyrir svar glugga?
     *
     * @return DialogPane
     */
    private DialogPane lesaSvarDialog() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/hi/verkefni/svar-view.fxml"));
        try {
            fxmlLoader.setController(this);
            return fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

}
