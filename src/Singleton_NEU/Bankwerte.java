package Singleton_NEU;

/**
 * Created by Optimus82 on 07.02.17.
 */
public class Bankwerte {

    private double kontenZinsen;

    private int kontenGebuehren;

    private static Bankwerte eInstanz = new Bankwerte();

    private Bankwerte() {

    }

   public static Bankwerte getInstance() {
        return eInstanz;
    }

    public double setKontoZinsen(double kontenZinsen) {
        kontenZinsen = kontenZinsen;
        System.out.println("Kontozinsen auf " + kontenZinsen + " % gesetzt");
        return kontenZinsen;

    }

    public int setKontoGebuehren(int kontenGebuehren) {
        kontenGebuehren = kontenGebuehren;
        System.out.println("Kontogebühren auf " + kontenGebuehren + " % gesetzt");
        return kontenGebuehren;
    }


}
