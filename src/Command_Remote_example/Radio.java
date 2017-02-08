package Command_Remote_example;

/**
 * Created by Optimus82 on 06.02.17.
 */
public class Radio implements ElectronikDevice {

    private int volume = 0;

    @Override
    public void on() {
        System.out.println("Das Radio ist an");
    }

    @Override
    public void off() {
        System.out.println("Das Radio ist aus");
    }

    @Override
    public void volumeUp() {
        System.out.println("Radio-Lautstärke auf " + volume);

    }

    @Override
    public void volumeDown() {
        System.out.println("Radio-Lautstärke auf " + volume);
    }
}
