package VIEW;

import MODUL.ToyMarket;

public class ViewToyMarket {
    ToyMarket toyMarket;

    public void printAllToys(){
        System.out.println(toyMarket.getListToys());
    }
}
