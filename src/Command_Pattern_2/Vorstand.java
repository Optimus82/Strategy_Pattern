package Command_Pattern_2;

/**
 * Created by Optimus82 on 07.02.17.
 */
public class Vorstand {

    private DruckBefehl druckBefehl;

    public void setDruckBefehl(DruckBefehl druckBefehl){
        this.druckBefehl = druckBefehl;
    }

    public void druckAusloesen(){
        druckBefehl.ausfuehren();
    }
}
