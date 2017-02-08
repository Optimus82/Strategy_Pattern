package Command_Remote_example;

/**
 * Created by Optimus82 on 06.02.17.
 */
public class VolumeTVDown implements Command {

    ElectronikDevice newDevice;

    public VolumeTVDown(ElectronikDevice myDevice) {
        this.newDevice = myDevice;
    }

    @Override
    public void execute() {
        newDevice.volumeDown();
    }
}
