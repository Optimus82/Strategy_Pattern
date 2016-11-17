package Observer_Pattern_implizit_JAVA;


/**
 * Created by Optimus82 on 14.11.16.
 */
public class BrutDatenTest {
    public static void main(String[] args) {

        BrutDaten brutDaten = new BrutDaten();
        Anzeige1 oAnzeige1 = new Anzeige1(brutDaten);
        Anzeige2 oAnzeige2 = new Anzeige2(brutDaten);
        Anzeige3 oAnzeige3 = new Anzeige3(brutDaten);


        System.out.println(brutDaten.countObservers());

        brutDaten.setMesswerte(30.0f, 55, true);
        //brutDaten.setMesswerte(35.0f, 60, true);
        //brutDaten.setMesswerte(33.0f, 59, false);


    }

}
