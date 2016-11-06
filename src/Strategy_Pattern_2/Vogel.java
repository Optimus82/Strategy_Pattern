package Strategy_Pattern_2;

/**
 * Created by Optimus82 on 06.11.16.
 */
public class Vogel extends Tier{
    public Vogel() {
         bv = new KannFliegen();
        fv = new LegtEier();
    }
}
