package Strategy_Pattern_2;

/**
 * Created by Optimus82 on 06.11.16.
 */
public class KannNichtFliegen implements Bewegungsverhalten {
    @Override
    public void bewegen() {
        System.out.println("Ich bin ein Säugetier und der Himmel bleibt für mich unerreicht!");

    }
}
