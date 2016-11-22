package Decorater_Aufgabe4;

import Decorator_Pattern.Getraenk;

/**
 * Created by Optimus82 on 21.11.16.
 */
public class Pfirsichlikoer implements Getränk {

    protected Getränk getränk;

    public Pfirsichlikoer(Getränk getränk) {
        this.getränk = getränk;
    }

    public Pfirsichlikoer(){

    }
    @Override
    public double getPreis() {
        return getränk.getPreis() + 1.00;
    }

    @Override
    public String getBeschreibing() {
        return getränk.getBeschreibing() + " 2 cl Pfirsichlikör";
    }
}
