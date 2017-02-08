package Decorator_NEU;

/**
 * Created by Optimus82 on 08.02.17.
 */
public class PKWTest {

    public static void main(String[] args) {

        PKW myPKW = new Ledersitze(new BMW());

        System.out.println(myPKW.getPreis());
        myPKW.beschreiben();

        myPKW = new Lakierung(myPKW);
        System.out.println(myPKW.getPreis());
        myPKW.beschreiben();





    }
}
