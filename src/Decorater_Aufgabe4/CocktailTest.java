package Decorater_Aufgabe4;


/**
 * Created by Optimus82 on 22.11.16.
 */
public class CocktailTest {

    public static void main(String[] args) {

        Getränk Sex = new OrangenSaft();
        Sex = new Pfirsichlikoer(Sex);
        Sex = new CranberrySaft(Sex);
        Sex = new Wodka(Sex);
        Sex = new Wodka(Sex);

        System.out.println(Sex.getBeschreibing() + " " + Sex.getPreis() + " € ");





    }
}
