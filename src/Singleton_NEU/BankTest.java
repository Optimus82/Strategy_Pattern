package Singleton_NEU;

/**
 * Created by Optimus82 on 07.02.17.
 */
public class BankTest {

    public static void main(String[] args) {


        Bankwerte bankwerte = Bankwerte.getInstance();
        System.out.println(Bankwerte.getInstance());
        bankwerte.setKontoGebuehren(5);
        bankwerte.setKontoZinsen(7.8);
        Bankwerte bankwerte1= Bankwerte.getInstance();
        System.out.println(Bankwerte.getInstance());
        System.out.println(Bankwerte.getInstance());





    }

}
