package Strategy_Pattern;

/**
 * Created by Optimus82 on 06.11.16.
 */
public class PlastikRoboter extends Roboter  {

    public PlastikRoboter() {
        redeVerhalten = new KannReden();
        trageVerhalten = new KannDingeTragen();
        schwimmverhalten = new KannSchwimmen();
    }
}
