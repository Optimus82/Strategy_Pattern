package Strategy_Pattern_2;

/**
 * Created by Optimus82 on 06.11.16.
 */
public class Tier {

    FortpflanzungVerhalten fv;
    Bewegungsverhalten bv;

    public void bewegen(){
        bv.bewegen();
    }
    public void fortpflanzen(){
        fv.fortpflanzen();
    }
}
