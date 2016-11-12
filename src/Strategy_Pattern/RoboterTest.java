package Strategy_Pattern;

/**
 * Created by Optimus82 on 06.11.16.
 */
public class RoboterTest {

    public static void main(String[] args) {

        Roboter fabi = new PlastikRoboter();
        Roboter terminator = new HolzRoboter();
        Roboter spinni = new SpinnenRoboter();
        fabi.reden();
        fabi.tragen();
        fabi.schwimmen();


    }
}
