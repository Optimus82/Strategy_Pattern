package Strategy_Pattern_2;

/**
 * Created by Optimus82 on 06.11.16.
 */
public class KannFliegen implements Bewegungsverhalten {
    @Override
    public void bewegen() {
        System.out.println("Ich bin ein Vogel und kann fliegen!");

    }
}
