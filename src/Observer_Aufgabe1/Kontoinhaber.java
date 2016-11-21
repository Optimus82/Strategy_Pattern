package Observer_Aufgabe1;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Optimus82 on 18.11.16.
 */
public class Kontoinhaber implements Observer {

    private String name;


    public Kontoinhaber(String name) {
        this.name = name;
    }


    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg);
    }

}
