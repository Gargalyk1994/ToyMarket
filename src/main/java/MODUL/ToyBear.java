package MODUL;

import java.util.Random;

public class ToyBear extends Toy{


    public ToyBear(int id, String name, double weight) {
        super(id, name, weight);
    }

    @Override
    public double frequencyOfWeightLoss() {
        return new Random().nextDouble(1,3);
    }
}
