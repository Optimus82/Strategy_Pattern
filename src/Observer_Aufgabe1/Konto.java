package Observer_Aufgabe1;

import java.util.ArrayList;
import java.util.Observable;

/**
 * Created by Optimus82 on 18.11.16.
 */
public class Konto extends Observable {

    private double kontostand = 0.00;
    private Kunde kontoInhaber;
    private long kontoID;





    public Konto(Kunde kunde, long kontoID) {
        this.kontoInhaber = kunde;
        this.kontoID = kontoID;
        this.addObserver(kunde);



    }

    public double gutschreiben(double betrag) {
        kontostand += betrag;
        setChanged();
        notifyObservers(anzeigen());

        return kontostand;

    }

    public double belasten(double betrag) {
        kontostand -= betrag;
        setChanged();
        notifyObservers(anzeigen());

        return kontostand;
    }

    public String anzeigen(){
        if (kontostand < 0.00)
            return "ACHTUNG - Das Konto mit der ID: " + kontoID + " hat den Kontostand SOLL: " + kontostand + " € ";
        else
            return "ACHTUNG - Das Konto mit der ID: " + kontoID + " hat den Kontostand HABEN: " + kontostand + " € ";
    }

}



