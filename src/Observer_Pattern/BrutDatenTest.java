package Observer_Pattern;

/**
 * Created by Optimus82 on 14.11.16.
 */
public class BrutDatenTest {
    public static void main(String[] args) {

        BrutDaten brutDaten = new BrutDaten();
        Anzeige1 oAnzeige1 = new Anzeige1(brutDaten);
        Anzeige1 oAnzeige2 = new Anzeige1(brutDaten);
        Anzeige1 oAnzeige3 = new Anzeige1(brutDaten);

        brutDaten.setMesswerte(30.3f, 55, true);
        brutDaten.setMesswerte(35.0f, 60, true);
        brutDaten.setMesswerte(35.0f, 59, false);
    }

}
