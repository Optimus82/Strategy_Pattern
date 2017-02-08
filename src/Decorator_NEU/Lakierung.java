package Decorator_NEU;

/**
 * Created by Optimus82 on 08.02.17.
 */
public class Lakierung extends Austattung{



    public Lakierung(PKW pkw) {
        super(pkw);
    }

    @Override
    public double getPreis() {

        return pkw.getPreis() + 5000;
    }

    @Override
    public void beschreiben() {
        pkw.beschreiben();
        System.out.print(", Metallik-Lackierung");

    }
}
