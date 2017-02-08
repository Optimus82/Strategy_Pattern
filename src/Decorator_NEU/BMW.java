package Decorator_NEU;

/**
 * Created by Optimus82 on 08.02.17.
 */
public class BMW implements PKW {
    @Override
    public double getPreis() {
        return 80000;
    }

    @Override
    public void beschreiben() {
        System.out.print("BMW");
    }
}
