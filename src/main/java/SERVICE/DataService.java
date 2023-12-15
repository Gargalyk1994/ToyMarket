package SERVICE;

import MODUL.Toy;
import MODUL.ToyMarket;

import java.util.ArrayList;

public class DataService {
    ToyMarket toyMarket;

    public ArrayList<Toy> createListToys(){
        return toyMarket.getListToys();
    }
}
