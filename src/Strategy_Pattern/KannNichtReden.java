package Strategy_Pattern;

/**
 * Created by Optimus82 on 06.11.16.
 */
public class KannNichtReden implements RedeVerhalten {
    @Override
    public void reden() {
        System.out.println("Ich bin stumm!");

    }
}
