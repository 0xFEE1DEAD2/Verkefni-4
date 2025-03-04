package hi.verkefni.vidmot;

public class VelkominnController {

    /**
     * Skiptir yfir í spurningarskjá.
     */
    public void onSpurningar() {
        ViewSwitcher.switchTo(View.SPURNINGAR);
    }

    /**
     * Skiptir yfir í kveðjuskjá.
     */
    public void onKvedja() {
        ViewSwitcher.switchTo(View.KVEDJA);
    }
}