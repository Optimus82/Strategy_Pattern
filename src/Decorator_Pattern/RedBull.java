package Decorator_Pattern;

/**
 * Created by Optimus82 on 21.11.16.
 */
public class RedBull extends Getraenk {
    public RedBull() {
        beschreibung = "RedBull";
    }

    @Override
    public double getPreis() {
        return 3.50;
    }
}
