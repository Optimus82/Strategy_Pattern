package Decorator_NEU;

/**
 * Created by Optimus82 on 08.02.17.
 */
public abstract class Austattung implements PKW{

    protected PKW pkw;

    public Austattung(PKW pkw) {
        this.pkw = pkw;
    }


}
