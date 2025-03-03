module hi.verkefni.vidtalsthjalfinn {
    requires javafx.controls;
    requires javafx.fxml;


    opens hi.verkefni to javafx.fxml;
    exports hi.verkefni.vinnsla;
    exports hi.verkefni.vidmot;
    opens hi.verkefni.vidmot to javafx.fxml;
}