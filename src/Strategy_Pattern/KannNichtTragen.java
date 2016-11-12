package Strategy_Pattern;

/**
 * Created by Optimus82 on 06.11.16.
 */
public class KannNichtTragen implements TrageVerhalten {
    @Override
    public void tragen() {
        System.out.println("Sorry, ich kann nichts tragen!");

    }
}
