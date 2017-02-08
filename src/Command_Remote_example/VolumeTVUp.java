package Command_Remote_example;

/**
 * Created by Optimus82 on 06.02.17.
 */
public class VolumeTVUp implements Command{

    ElectronikDevice newDevice;

    public VolumeTVUp(ElectronikDevice myDevice) {
        this.newDevice = myDevice;
    }

    @Override
    public void execute() {
        newDevice.volumeUp();
    }
}
