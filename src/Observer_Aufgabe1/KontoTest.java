package Observer_Aufgabe1;

import java.util.Observer;

/**
 * Created by Optimus82 on 18.11.16.
 */
public class KontoTest {

    public static void main(String[] args) {

        Kunde oKunde = new Kunde("Fabian Steffan");
        Konto oKonto = new Konto(oKunde, 5404056854l);




        oKonto.gutschreiben(5);
        oKonto.belasten(500);
        oKonto.gutschreiben(5000);





    }
}

