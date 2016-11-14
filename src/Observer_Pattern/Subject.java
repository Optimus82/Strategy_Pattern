package Observer_Pattern;

/**
 * Created by Optimus82 on 14.11.16.
 */
public interface Subject {

    public void registrieBeobachter(Beobachter beobachter);
    public void entferneBeobachter(Beobachter beobachter);
    public void aktualisiereBeobachter();


}
