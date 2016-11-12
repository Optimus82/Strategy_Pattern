package Strategy_Pattern;

/**
 * Created by Optimus82 on 06.11.16.
 */
public class SpinnenRoboter extends Roboter {

    public SpinnenRoboter() {
        redeVerhalten = new KannNichtReden();
        trageVerhalten = new KannNichtTragen();
        schwimmverhalten = new KannSchwimmen();

    }

    public void setRedeverhalten(RedeVerhalten rv){
        redeVerhalten = rv;
    }

    public void setTrageverhalten(TrageVerhalten tv){
        trageVerhalten = tv;
    }


}
