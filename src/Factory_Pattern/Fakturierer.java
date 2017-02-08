package Factory_Pattern;

import javax.xml.crypto.dom.DOMURIReference;

/**
 * Created by Optimus82 on 05.02.17.
 */
public abstract class Fakturierer {

    public abstract Dokument erzeugeDokument();

    public void fakturiereDokument(){

        Dokument dokument = erzeugeDokument();
        if(!isValid(dokument)) throw new IllegalArgumentException("Das zu verarbeitende Dokument ist ungültig");

         }

    public boolean isValid(Dokument dokument){
        if(dokument.getBelegnummer() == 0){
            return true;
        }
        return false;
    }



}
