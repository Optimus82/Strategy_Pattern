package Strategy_Pattern_2;

/**
 * Created by Optimus82 on 06.11.16.
 */
public class Saeugetier extends Tier{
    public Saeugetier() {
        bv  = new KannNichtFliegen();
        fv  = new KannGebaehren();
    }
}
