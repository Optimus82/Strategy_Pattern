package Sigleton_Pattern;

/**
 * Created by Optimus82 on 07.12.16.
 */
public class Zaubermaschine  {

    private boolean leer;
    private boolean gefroren;
    private static Zaubermaschine eInstanz = new Zaubermaschine();


    private Zaubermaschine() {
        leer = true;
        gefroren = false;
    }

    public void füllen() {
        if (isLeer()) {
            leer = false;
            gefroren = false;
        } else {
            System.out.println("Fehler, Maschine bereits befüllt");
        }
    }

    public boolean isLeer() {
        return leer;
    }

    public boolean isGefroren() {
        return gefroren;
    }

    public void leeren() {
        if (!isLeer() && isGefroren()) {
            leer = true;
        } else {
            System.out.println("Fehler, Maschine ist bereits leer!");
        }
    }

    public void frieren() {
        if (!isLeer() && !isGefroren()) {
            gefroren = true;
        } else {
            System.out.println("Fehler, Maschine nicht befüllt");
        }
    }

    public static Zaubermaschine getInstanz() {
        System.out.println("Instanz wird erzeugt");
        return eInstanz;
    }


}
