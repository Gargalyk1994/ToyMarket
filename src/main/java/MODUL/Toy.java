package MODUL;

import java.util.Random;

public abstract class Toy {
    protected int id;
    protected String name;
    protected double weight;
    protected int amount;

    public Toy(int id, String name, double weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", amount=" + amount +
                '}';
    }

    public abstract double frequencyOfWeightLoss();
}
