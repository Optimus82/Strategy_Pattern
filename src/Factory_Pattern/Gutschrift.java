package Factory_Pattern;

/**
 * Created by Optimus82 on 05.02.17.
 */
public class Gutschrift extends Dokument {

    private float gutschriftbetrag;

    public boolean isValid (){
        return super.isValid() && gutschriftbetrag > 0;
    }

}
