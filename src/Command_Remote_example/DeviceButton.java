package Command_Remote_example;

/**
 * Created by Optimus82 on 06.02.17.
 */
public class DeviceButton {

    Command myCommand;

    public DeviceButton(Command myCommand) {
        this.myCommand = myCommand;
    }

    public void press(){
        myCommand.execute();
    }
}
