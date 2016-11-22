package Decorater_Aufgabe4;


/**
 * Created by Optimus82 on 22.11.16.
 */
public class CocktailTest {

    public static void main(String[] args) {

        Getränk SexOnTheBeach = new OrangenSaft();
        SexOnTheBeach = new Pfirsichlikoer(SexOnTheBeach);
        SexOnTheBeach = new CranberrySaft(SexOnTheBeach);
        SexOnTheBeach = new Wodka(SexOnTheBeach);
        SexOnTheBeach = new Wodka(SexOnTheBeach);

        System.out.println(SexOnTheBeach.getBeschreibing() + " " + SexOnTheBeach.getPreis() + " € ");





    }
}
