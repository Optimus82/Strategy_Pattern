package Uebung2;

/**
 * Created by Optimus82 on 03.11.16.
 */
public class Kaefig <E>{

    private E[] groesse;

    public Kaefig (int anzahl){
        groesse = (E[]) new Object [anzahl];
    }

    public E[] getGroesse() {
        return groesse;
    }
}
