package Observer_Pattern;

/**
 * Created by Optimus82 on 14.11.16.
 */
public class Anzeige3 implements Beobachter,AnzeigeElement {

    private float temperatur;
    private float luftfeuchtigkeit;
    private Subject brutdaten;

    public Anzeige3(Subject brutdaten) {
        this.brutdaten = brutdaten;
        brutdaten.registriereBeobachter(this);
    }

    @Override
    public void aktualisieren(float temp, float luftfechtigkeit, boolean lampStatus) {
        this.temperatur = temp;
        this.luftfeuchtigkeit = luftfechtigkeit;
        anzeigen();

    }

    @Override
    public void anzeigen() {
        System.out.println("Anzeige3 Brutwerte: " + temperatur + " Grad C und " + luftfeuchtigkeit +
                " % Luftfechtigkeit");

    }
}
