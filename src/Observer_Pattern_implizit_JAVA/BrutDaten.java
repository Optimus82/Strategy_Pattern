package Observer_Pattern_implizit_JAVA;

import java.util.ArrayList;
import java.util.Observable;

/**
 * Created by Optimus82 on 14.11.16.
 */
public class BrutDaten extends Observable {

    private ArrayList beobachter;
    private float temperatur;
    private float luftfeuchtigkeit;
    private boolean lampStatus;

    public BrutDaten() {
        beobachter = new ArrayList();
    }


    public void setMesswerte(float temp, float lf, boolean ls) {
        this.temperatur = temp;
        this.luftfeuchtigkeit = lf;
        this.lampStatus = ls;
        setChanged();
        notifyObservers();
    }

}
