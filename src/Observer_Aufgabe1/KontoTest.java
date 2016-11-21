package Observer_Aufgabe1;

/**
 * Created by Optimus82 on 18.11.16.
 */
public class KontoTest {

    public static void main(String[] args) {

        Kontoinhaber oKontoinhaber = new Kontoinhaber("Fabian Steffan");
        Konto oKonto = new Konto(oKontoinhaber, "5404056854");
        oKonto.addObserver(oKontoinhaber);
        oKonto.gutschreiben(670.00);
        oKonto.belasten(940.00);
        oKonto.gutschreiben(1500);
        System.out.println(oKonto.countObservers());

    }
}

