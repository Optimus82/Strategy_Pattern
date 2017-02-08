package Decorator_NEU;

/**
 * Created by Optimus82 on 08.02.17.
 */
public class Audi implements PKW {
    @Override
    public double getPreis() {
        return 45000;
    }

    @Override
    public void beschreiben() {
        System.out.print("Audi");

    }
}
