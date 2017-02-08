package Strategie_GANZ_NEU;

/**
 * Created by Optimus82 on 07.02.17.
 */
public abstract class Alien {

    Verhalten verhalten = new GutVerhalten();
    Herrkunft geboren = new KommtVonMars();

    public void setVerhalten(Verhalten verhalten) {
        this.verhalten = verhalten;
    }

    public void setGeboren(Herrkunft geboren) {
        this.geboren = geboren;
    }

    public void verhalten(){
        verhalten.verhalten();
    }

    public void geboren(){
        geboren.geboren();

    }
}
