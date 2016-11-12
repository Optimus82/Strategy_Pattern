package Strategy_Pattern;

/**
 * Created by Optimus82 on 06.11.16.
 */
public class HolzRoboter extends Roboter {

    public HolzRoboter() {
        redeVerhalten = new KannReden();
        trageVerhalten = new KannDingeTragen();
        schwimmverhalten = new KannNichtSchwimmen();
    }
}
