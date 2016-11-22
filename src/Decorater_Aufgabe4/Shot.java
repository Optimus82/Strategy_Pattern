package Decorater_Aufgabe4;

/**
 * Created by Optimus82 on 22.11.16.
 */
public class Shot implements Getränk {

    Getränk getränk;

    public Shot(Getränk getränk) {
        this.getränk = getränk;
    }

    @Override
    public double getPreis() {
        return getränk.getPreis() + 2.50;
    }

    @Override
    public String getBeschreibing() {
        return getränk.getBeschreibing() + " extra Schuss ";
    }
}
