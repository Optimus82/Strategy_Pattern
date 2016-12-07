package Observer_Aufgabe1;

/**
 * Created by Optimus82 on 18.11.16.
 */
public class KontoTest {

    public static void main(String[] args) {

        Kontoinhaber oKontoinhaber = new Kontoinhaber("Fabian Steffan");
        Konto oKonto = new Konto(oKontoinhaber, 5404056854l);
        oKonto.addObserver(oKontoinhaber);
        oKonto.gutschreiben(5);
        oKonto.belasten(500);

    }
}

