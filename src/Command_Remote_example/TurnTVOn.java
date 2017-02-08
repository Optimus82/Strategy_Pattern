package Command_Remote_example;

/**
 * Created by Optimus82 on 06.02.17.
 */
public class TurnTVOn implements Command {

    ElectronikDevice myDevice;

    public TurnTVOn(ElectronikDevice newDevice) {
        this.myDevice = newDevice;
    }

    @Override
    public void execute() {
        myDevice.on();

    }
}
