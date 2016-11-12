package Strategy_Pattern;

/**
 * Created by Optimus82 on 06.11.16.
 */
public abstract class Roboter {

    TrageVerhalten trageVerhalten;
    RedeVerhalten redeVerhalten;
    Schwimmverhalten schwimmverhalten;

    public void laufen() {

    }

    public void anzeigen() {

    }

    public void schwimmen() {
        schwimmverhalten.schwimmen();

    }

    public void tragen() {

        trageVerhalten.tragen();
    }

    public void reden() {
        redeVerhalten.reden();
    }


}
