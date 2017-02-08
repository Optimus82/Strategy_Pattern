package Factory_Pattern;

/**
 * Created by Optimus82 on 05.02.17.
 */
public class GutschriftFakturierer extends Fakturierer {

    @Override
    public Dokument erzeugeDokument() {
        return new Gutschrift(); //konkretes Objekt von Dokumente erzeugen / zurückgeben
    }
}
