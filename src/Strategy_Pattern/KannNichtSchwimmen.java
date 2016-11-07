package Strategy_Pattern;

/**
 * Created by Optimus82 on 07.11.16.
 */
public class KannNichtSchwimmen implements Schwimmverhalten {
    @Override
    public void schwimmen() {
        System.out.println("Ich bin doch wasserscheu!");
    }
}
