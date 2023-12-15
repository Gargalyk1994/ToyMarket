package CONTROLLER;

import SERVICE.DataService;
import VIEW.ViewToyMarket;

public class Controller {
    DataService dataService = new DataService();
    ViewToyMarket view = new ViewToyMarket();

    public void createToys(){
        dataService.createListToys();
        view.printAllToys();
    }

    public void frequencyOfWeightLoss(){

    }
}
