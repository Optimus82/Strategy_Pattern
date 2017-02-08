package Command_Remote_example;

/**
 * Created by Optimus82 on 06.02.17.
 */
public class Television implements ElectronikDevice{

    private int volume = 0;


    @Override
    public void on() {
        System.out.println("Der Fernseher ist an");
    }

    @Override
    public void off() {
        System.out.println("Der Fernsehen ist aus");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("Laustärke erhöht auf "+ volume);
    }

    @Override
    public void volumeDown() {
        if(volume == 0)
            volume = 0;
        else volume--;
        System.out.println("Lautstärke leiser auf "+ volume);

    }
}
