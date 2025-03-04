package hi.verkefni.vidmot;

public class VelkominnController {

    public void onSpurningar() {
        ViewSwitcher.switchTo(View.SPURNINGAR);
    }

    public void onKvedja() {
        ViewSwitcher.switchTo(View.KVEDJA);
    }
}