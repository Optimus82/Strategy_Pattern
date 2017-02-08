package Command_Remote_example;

/**
 * Created by Optimus82 on 06.02.17.
 */
public class TurnRadioOn implements Command {

    ElectronikDevice newRadio;

    public TurnRadioOn(ElectronikDevice myRadio) {
        this.newRadio = myRadio;
    }

    @Override
    public void execute() {
        newRadio.on();
    }
}
