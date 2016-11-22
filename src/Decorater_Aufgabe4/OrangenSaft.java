package Decorater_Aufgabe4;

import Decorator_Pattern.Getraenk;

/**
 * Created by Optimus82 on 21.11.16.
 */
public class OrangenSaft implements Getränk  {

    protected Getränk getränk;

    public OrangenSaft(Getränk getränk) {
        this.getränk = getränk;
    }

    public OrangenSaft(){

    }
    @Override
    public double getPreis() {
        return 1.50;
    }

    @Override
    public String getBeschreibing() {
        return " 4 cl Orangensaft";
    }
}
