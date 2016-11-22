package Decorater_Aufgabe4;

/**
 * Created by Optimus82 on 22.11.16.
 */
public class Wodka implements AlkoholDekorierer,Getränk {

    protected Getränk getränk;

    public Wodka(Getränk getränk) {
        this.getränk = getränk;
    }

    public Wodka() {

    }

    @Override
    public double getPreis() {
        return getränk.getPreis() + 2.50;
    }

    @Override
    public String getBeschreibing() {
        return getränk.getBeschreibing() + " 2 cl Vodka";
    }


    @Override
    public String getBeschreibung() {
        return getränk.getBeschreibing() + " 2 cl Vodka";
    }
}
