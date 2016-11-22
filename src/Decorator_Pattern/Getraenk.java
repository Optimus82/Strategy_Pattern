package Decorator_Pattern;

/**
 * Created by Optimus82 on 21.11.16.
 */
public abstract class Getraenk {

    public String beschreibung;


    public String getBeschreibung() {
        return beschreibung;
    }

    public abstract double getPreis();
}
