package Observer_Pattern_implizit_JAVA;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Optimus82 on 14.11.16.
 */
public class Anzeige2 implements Observer{

    private float temperatur;
    private float luftfeuchtigkeit;
    private BrutDaten brutDaten;


    public Anzeige2(BrutDaten brutDaten) {
        brutDaten.addObserver(this);

    }
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Anzeige2 Brutwerte: " + temperatur + " Grad C und " + luftfeuchtigkeit +
                " % Luftfechtigkeit");
    }
}
