package Command_Remote_example;

/**
 * Created by Optimus82 on 06.02.17.
 */
public class PlayWithDevice {

    public static void main(String[] args) {

        ElectronikDevice newDevice = TVRemote.getDevice(); //TV Objekt erstellt

        TurnTVOn onCommand = new TurnTVOn(newDevice);

        DeviceButton onPressed = new DeviceButton(onCommand);

        onPressed.press();

        //---------------

        TurnTVOff offCommand = new TurnTVOff(newDevice);

        onPressed = new DeviceButton(offCommand);

        onPressed.press();

        //-----------------

        VolumeTVUp upCommand = new VolumeTVUp(newDevice);

        onPressed = new DeviceButton(upCommand);

        onPressed.press();
        onPressed.press();
        onPressed.press();
        onPressed.press();
        onPressed.press();

        ElectronikDevice newRadioDevice = RadioRemote.getDevice();

        TurnRadioOn radioCommand = new TurnRadioOn(newRadioDevice);

        DeviceButton onRadio = new DeviceButton(radioCommand);

        onRadio.press();

        }

    }

