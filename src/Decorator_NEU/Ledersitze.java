package Decorator_NEU;

/**
 * Created by Optimus82 on 08.02.17.
 */
public class Ledersitze extends Austattung {



    public Ledersitze(PKW pkw) {
        super(pkw);
    }

    @Override
    public double getPreis() {
        return pkw.getPreis() + 2000;
    }

    @Override
    public void beschreiben() {
        pkw.beschreiben();
        System.out.print(", Ledersitze");

    }
}
