package Observer_Pattern;

/**
 * Created by Optimus82 on 14.11.16.
 */
public class Anzeige1 implements Beobachter,AnzeigeElement {

    private float temperatur;
    private float luftfeuchtigkeit;
    private Subject brutdaten;

    public Anzeige1(Subject brutdaten) {
        this.brutdaten = brutdaten;
        brutdaten.registriereBeobachter(this);
    }

    @Override
    public void aktualisieren(float temp, float lf, boolean lampStatus) {
        this.temperatur = temp;
        this.luftfeuchtigkeit = lf;
        anzeigen();

    }

    @Override
    public void anzeigen() {
        System.out.println("Anzeige1 Brutwerte: " + temperatur + " Grad C und " + luftfeuchtigkeit +
        " % Luftfechtigkeit");
    }
}
