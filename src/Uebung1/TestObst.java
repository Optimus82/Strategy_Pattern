package Uebung1;

import Uebung1.Apfel;
import Uebung1.Banane;

import java.util.ArrayList;

/**
 * Created by Optimus82 on 26.10.16.
 */
public class TestObst {

    public static void main(String[] args) {

        ArrayList<Apfel> aepfel = new ArrayList<>();
        ArrayList<Banane> bananen = new ArrayList<>();


        Apfel oApfel1 = new Apfel();
        oApfel1.setFarbe("blau");
        Apfel oApfel2 = new Apfel();
        oApfel2.setFarbe("gruen");
        Apfel oApfel3 = new Apfel();
        oApfel3.setFarbe("rosa");
        Apfel oApfel4 = new Apfel();
        oApfel4.setFarbe("orange");
        Apfel oApfel5 = new Apfel();
        oApfel5.setFarbe("dunkelgruen");
        Apfel oApfel6 = new Apfel();
        oApfel6.setFarbe("violet");
        Apfel oApfel7 = new Apfel();
        oApfel7.setFarbe("schwarz");
        Apfel oApfel8 = new Apfel();
        oApfel8.setFarbe("faulig-braun");
        Apfel oApfel9 = new Apfel();
        oApfel9.setFarbe("giftig-gruen");
        Apfel oApfel10 = new Apfel();
        oApfel10.setFarbe("lecker");

        aepfel.add(oApfel1);
        aepfel.add(oApfel2);
        aepfel.add(oApfel3);
        aepfel.add(oApfel4);
        aepfel.add(oApfel5);
        aepfel.add(oApfel6);
        aepfel.add(oApfel7);
        aepfel.add(oApfel8);
        aepfel.add(oApfel9);
        aepfel.add(oApfel10);

        Banane oBanane1 = new Banane();
        oBanane1.setFarbe("gelb");
        Banane oBanane2 = new Banane();
        oBanane2.setFarbe("super-gelb");
        Banane oBanane3 = new Banane();
        oBanane3.setFarbe("grun");
        Banane oBanane4 = new Banane();
        oBanane4.setFarbe("schwarz");
        Banane oBanane5 = new Banane();
        oBanane5.setFarbe("orange");
        Banane oBanane6 = new Banane();
        oBanane6.setFarbe("blau");
        Banane oBanane7 = new Banane();
        oBanane7.setFarbe("grün-gelb");
        Banane oBanane8 = new Banane();
        oBanane8.setFarbe("braun");
        Banane oBanane9 = new Banane();
        oBanane9.setFarbe("asiatisch");
        Banane oBanane10 = new Banane();
        oBanane10.setFarbe("quitte-gelb");



        System.out.print("Apfelfarben: ");

        for (Object o : aepfel) {
            Apfel oApfel = (Apfel) o;
            oApfel.getFarbe();
        }

        bananen.add(oBanane1);
        bananen.add(oBanane2);
        bananen.add(oBanane3);
        bananen.add(oBanane4);
        bananen.add(oBanane5);
        bananen.add(oBanane6);
        bananen.add(oBanane7);
        bananen.add(oBanane8);
        bananen.add(oBanane9);
        bananen.add(oBanane10);


        System.out.println();
        System.out.println();
        System.out.print("Bananenfarben: ");


        for (Object o : bananen) {
            Banane oBanane = (Banane) o;
            oBanane.getFarbe();
        }


    }


}

