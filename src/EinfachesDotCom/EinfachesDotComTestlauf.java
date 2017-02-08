package EinfachesDotCom;

/**
 * Created by Optimus82 on 06.11.16.
 */
public class EinfachesDotComTestlauf {

    public static void main(String[] args) {

        EinfachesDotCom dotCom = new EinfachesDotCom();

        int [] orte = {0,1,2}; // Position des DotComs auf dem Array
        dotCom.setZellorte(orte); //übergebe die vorab gesetzten Zellorte an die Instanz
        String tipp = "2"; //mögliche Eingabe des Spielers
        String ergebnis = dotCom.prueDich(tipp);
        String testErgebnis = "Fehlgeschlagen";

        if (testErgebnis.equals("Treffer")) {
            testErgebnis = "Bestanden";
        }
        System.out.println(testErgebnis);


    }
}
