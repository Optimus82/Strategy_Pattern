package Decorator_Pattern;

/**
 * Created by Optimus82 on 21.11.16.
 */
public class Vodka extends AlkoholDekorierer {

    Getraenk getraenk;


    public Vodka(Getraenk getraenk) {

        this.getraenk = getraenk;

    }


    @Override
    public String getBeschreibung() {
        return getraenk.getBeschreibung() + " + 2cl Vodka";
    }

    @Override
    public double getPreis() {
        return getraenk.getPreis() + 2.50;
    }
}
