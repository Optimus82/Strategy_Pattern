package Strategy_Pattern_2;

/**
 * Created by Optimus82 on 06.11.16.
 */
public class Main {
    public static void main(String[] args) {

        Tier oTierEins = new Saeugetier();
        Tier oTierzwei = new Vogel();
        oTierEins.bewegen();
        oTierzwei.bewegen();
        oTierzwei.fortpflanzen();
        oTierEins.fortpflanzen();





    }
}
