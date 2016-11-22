package Decorater_Aufgabe4;

import Decorator_Pattern.Getraenk;

/**
 * Created by Optimus82 on 22.11.16.
 */
public class CranberrySaft implements Getränk {

    protected Getränk getränk;

    public CranberrySaft(Getränk getränk) {
        this.getränk = getränk;
    }

    public CranberrySaft(){

    }
    @Override
    public double getPreis() {
        return  getränk.getPreis() + 2.00;
    }

    @Override
    public String getBeschreibing() {
        return  getränk.getBeschreibing() + " 4 cl Cranberrysaft";
    }
}
