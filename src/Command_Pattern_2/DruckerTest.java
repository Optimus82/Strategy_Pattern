package Command_Pattern_2;

/**
 * Created by Optimus82 on 07.02.17.
 */
public class DruckerTest {

    public static void main(String[] args) {

        Vorstand vorstand = new Vorstand();
        vorstand.setDruckBefehl(new FarbDruckBefehl(new FarbDrucker()));

        vorstand.druckAusloesen();


    }
}
