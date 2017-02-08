package EinfachesDotCom;

/**
 * Created by Optimus82 on 06.11.16.
 */
public class EinfachesDotCom {

    private int [] zellorte;
    private int anzahlTreffer = 0;

    public void setZellorte(int[] zellorte) {
        this.zellorte = zellorte;
    }

    public String prueDich(String tipp){
        int stringTipp = Integer.parseInt(tipp); //parsen der String Eingabe in einer int Wert
        String ergebnis = "Vorbei";

        for (int zelle : zellorte){
            if(stringTipp == zelle){
                ergebnis = "Treffer";
                anzahlTreffer++;
                break; //bei TReffer aus der Schleife gehen und neue Eingabe des Spielers
            }
        }
        if(anzahlTreffer == zellorte.length){
            ergebnis = "Versenkt";
        }
        System.out.println(ergebnis);
        return ergebnis;
        }
    }


