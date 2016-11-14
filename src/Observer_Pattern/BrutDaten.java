package Observer_Pattern;

import java.util.ArrayList;

/**
 * Created by Optimus82 on 14.11.16.
 */
public class BrutDaten implements Subject {

    private ArrayList beobachter;
    private float temperatur;
    private float luftfeuchtigkeit;
    private boolean lampStatus;

    public BrutDaten() {
        beobachter = new ArrayList();
    }


    @Override
    public void registrieBeobachter(Beobachter oB) {
        beobachter.add(oB);

    }

    @Override
    public void entferneBeobachter(Beobachter oB) {
        int i = beobachter.indexOf(oB);
        if (i >= 0) {
            beobachter.remove(oB);
        }


    }

    @Override
    public void aktualisiereBeobachter() {
        for(int i = 0; i<beobachter.size();i++){
            Beobachter b = (Beobachter) beobachter.get(i);
            b.aktualisieren(temperatur,luftfeuchtigkeit,lampStatus);
        }

    }

    public void messwerteGeaendert(){
        aktualisiereBeobachter();

    }
    public void setMesswerte(float temp, float lf, boolean ls){
        this.temperatur = temp;
        this.lampStatus = ls;
        this.lampStatus = ls;

        messwerteGeaendert();
    }

}
