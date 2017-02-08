package SetterTest;

/**
 * Created by Optimus82 on 06.11.16.
 */
public class KatzeTest {

    public static void main(String[] args) {


        Katze eins = new Katze();
        System.out.println("Ein Test");

        eins.setGroesse(10);
        System.out.println(eins.getGroesse());
        int x = 33;
        int y = 33;

        if ( x == y){
            System.out.println("sind wirklich bitmäßig gleich");
        }else {
            System.out.println("passt garnicht zusammen");
        }
    }
}
