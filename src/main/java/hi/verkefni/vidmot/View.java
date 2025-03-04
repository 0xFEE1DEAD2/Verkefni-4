package hi.verkefni.vidmot;

public enum View {
    VELKOMINN("/hi/verkefni/velkominn-view.fxml"),
    SPURNINGAR("/hi/verkefni/spurningar-view.fxml"),
    KVEDJA("/hi/verkefni/kvedja-view.fxml");

    private String fileName;

    View(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}
