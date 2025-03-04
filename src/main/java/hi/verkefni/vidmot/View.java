package hi.verkefni.vidmot;

/**
 * Skilgreinir mismunandi útlit.
 */
public enum View {
    VELKOMINN("/hi/verkefni/velkominn-view.fxml"),
    SPURNINGAR("/hi/verkefni/spurningar-view.fxml"),
    KVEDJA("/hi/verkefni/kvedja-view.fxml");

    private final String fileName;

    /**
     * Smiðuyr fyrir View enum sem skilgreinir skrá útlits.
     *
     * @param fileName Slóð á fxml skrá.
     */
    View(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Skilar slóð fxml skrá.
     *
     * @return fxml slóð.
     */
    public String getFileName() {
        return fileName;
    }
}
