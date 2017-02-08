package Command_Pattern_2;

/**
 * Created by Optimus82 on 07.02.17.
 */
public class FarbDruckBefehl implements DruckBefehl {

    private FarbDrucker farbDrucker;

    public FarbDruckBefehl(FarbDrucker farbDrucker) {
        this.farbDrucker = farbDrucker;
    }

    @Override
    public void ausfuehren() {
     farbDrucker.drucken();
    }
}
