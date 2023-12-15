package MODUL;

import java.util.ArrayList;
import java.util.Random;

public class ToyMarket {
    Toy toy;
    private int price;
    private ArrayList<Toy> listToys;

    public ArrayList<Toy> getListToys(){
        ArrayList<Toy> toys = new ArrayList<>();
        Toy toy1 = new ToyCar(1, "Lamborghini", 1.2);
        Toy toy2 = new ToyCar(2, "Bugatti",1.1);
        Toy toy3 = new ToyCar(3, "Ferrari",0.4);
        Toy toy4 = new ToyCar(4, "Porsche",0.6);
        Toy toy5 = new ToyCar(5, "Lexus",0.5);
        Toy toy6 = new ToyBear(6, "Wini", 0.7);
        Toy toy7 = new ToyBear(7, "White", 0.2);
        Toy toy8 = new ToyBear(8, "Foma", 0.5);
        Toy toy9 = new ToyBear(9, "Black", 0.7);
        Toy toy10 = new ToyBear(10, "Panda", 0.3);
        Toy toy11 = new ToyPlane(11, "MI-21", 1.0);
        Toy toy12 = new ToyPlane(12, "MI-26", 0.6);
        Toy toy13 = new ToyPlane(13, "TY-10", 0.8);
        Toy toy14 = new ToyPlane(14, "SuperJet", 1.3);
        toys.add(toy1);
        toys.add(toy2);
        toys.add(toy3);
        toys.add(toy4);
        toys.add(toy5);
        toys.add(toy6);
        toys.add(toy7);
        toys.add(toy8);
        toys.add(toy9);
        toys.add(toy10);
        toys.add(toy11);
        toys.add(toy12);
        toys.add(toy13);
        toys.add(toy14);
        return toys;
    }


}
