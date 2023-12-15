package MODUL;

public class ToyPlane extends Toy{

    public ToyPlane(int id, String name, double weight) {
        super(id, name, weight);
    }

    @Override
    public double frequencyOfWeightLoss() {
        if (Math.random() * 3 == super.weight) {
            return super.weight;
        }
        throw new RuntimeException("Игрушка не выпала");
    }
}
