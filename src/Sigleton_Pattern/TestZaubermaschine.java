package Sigleton_Pattern;

/**
 * Created by Optimus82 on 15.12.16.
 */
public class TestZaubermaschine {


    public static void main(String[] args) {


        Zaubermaschine zaubermaschine = Zaubermaschine.getInstanz();

        zaubermaschine.frieren();
        zaubermaschine.leeren();
        zaubermaschine.leeren();

        System.out.println(zaubermaschine.isLeer());
    }


}
