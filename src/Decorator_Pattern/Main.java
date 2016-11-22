package Decorator_Pattern;

/**
 * Created by Optimus82 on 21.11.16.
 */
public class Main {

    public static void main(String[] args) {

        //Getraenk getraenk = new RedBull();
        //System.out.println(getraenk.getBeschreibung() + " " + getraenk.getPreis() + " €");

        Getraenk oVodkaBull = new RedBull();
        oVodkaBull = new Vodka(oVodkaBull);
        System.out.println(oVodkaBull.getBeschreibung() + " " + oVodkaBull.getPreis() + " €");

       // oVodkaBull = new Vodka(oVodkaBull);
        //System.out.println(oVodkaBull.getBeschreibung() + " " + oVodkaBull.getPreis() + " €");
        //System.out.println();


    }
}
