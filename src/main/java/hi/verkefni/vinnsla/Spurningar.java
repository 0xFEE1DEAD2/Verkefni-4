package hi.verkefni.vinnsla;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.HashMap;
import java.util.Map;

public class Spurningar {
    private final ObservableList<String> flokkar = FXCollections.observableArrayList();
    private final Map<String, ObservableList<String>> spurningar = new HashMap<>();
    private final SimpleStringProperty fjoldiSvaradraSpurninga = new SimpleStringProperty("0");

    public Spurningar() {
        flokkar.add("Tæknispurningar"); // flokkar.get(0)
        flokkar.add("Færnispurningar"); // flokkar.get(1)

        // Listi með tæknispurningum.
        ObservableList<String> flokkur1 = FXCollections.observableArrayList();
        flokkur1.add("Hvað er CPU?");
        flokkur1.add("Hvað gerir RAM?");
        flokkur1.add("Hvað stendur HTTPS fyrir?");

        // Listi með færnispurningum.
        ObservableList<String> flokkur2 = FXCollections.observableArrayList();
        flokkur2.add("Hvað er 3+5?");
        flokkur2.add("Hvað stendur AU fyrir í lotukerfinu?");
        flokkur2.add("Hver er höfuðborg Eistlands?");

        spurningar.put(flokkar.get(0), flokkur1); // Setja flokkur1 lista í tæknispurningar.
        spurningar.put(flokkar.get(1), flokkur2); // Setja flokkur2 lista í færnispurningar.
    }

    public ObservableList<String> getSpurningalisti(String flokkur) {
        return spurningar.get(flokkur);
    }

    public ObservableList<String> getFlokkar() {
        return flokkar;
    }

    public static void main (String [] args) {
        Spurningar spurningar = new Spurningar();
        System.out.println (spurningar.getSpurningalisti("Færnispurningar").get(1));
        System.out.println (spurningar.getSpurningalisti("Færnispurningar").get(2));
        System.out.println (spurningar.getSpurningalisti("Tæknispurningar").get(0));
        System.out.println (spurningar.getSpurningalisti("Tæknispurningar").get(1));
        System.out.println (spurningar.getFlokkar());
    }
}