package Strategie_NEU;

/**
 * Created by Optimus82 on 07.02.17.
 */
public abstract class Hund implements BellVerhalten,LaufVerhalten{

    BellVerhalten bellVerhalten = new LautBellen();
    LaufVerhalten laufVerhalten = new KannNIchtLaufen();

    public void setBellVerhalten(BellVerhalten bellVerhalten){
        this.bellVerhalten = bellVerhalten;
    }

    public void setLaufVerhalten(LaufVerhalten laufVerhalten) {
        this.laufVerhalten = laufVerhalten;
    }

    @Override
    public void bellen() {

        bellVerhalten.bellen();
    }

    @Override
    public void laufen() {
        laufVerhalten.laufen();
    }
}
