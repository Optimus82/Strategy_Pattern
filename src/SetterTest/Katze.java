package SetterTest;

/**
 * Created by Optimus82 on 06.11.16.
 */
public class Katze {

    private int groesse;



    public int getGroesse() {
        return groesse;
    }

    public void setGroesse(int g) {
        if (g > 9){
            this.groesse = g;
        }else {
            System.out.println("Die Katzengröße ist zu gering, nochmal eingeben");
        }
    }
}
