package co.edu.uptc.interfaces;

import co.edu.uptc.pojos.*;
import co.edu.uptc.utilities.SimpleList;

public interface iEVDContract {

    public interface Model {
        public void setPresenter(Presenter presenter);
        public void loadData();
        public SimpleList<CarModel> askCarModel();
        public SimpleList<Manufacturer> askManufacturer();
        public SimpleList<ElectricRange> askElectricRange();
        public SimpleList<State> askState();
        public SimpleList<County> askCounty();
        public SimpleList<City> askCity();
    }
    
    public interface View {
        public void setPresenter(Presenter presenter);
        public void begin();
        public void showMainFrame();
        public SimpleList<CarModel> askCarModel();
        public SimpleList<Manufacturer> askManufacturer();
        public SimpleList<ElectricRange> askElectricRange();
        public SimpleList<State> askState();
        public SimpleList<County> askCounty();
        public SimpleList<City> askCity();
    }
    
    public interface Presenter {
        public void setView(View view);
        public void setModel(Model model);
        public void loadData();
        public void showMainFrame();
        public SimpleList<CarModel> askCarModel();
        public SimpleList<Manufacturer> askManufacturer();
        public SimpleList<ElectricRange> askElectricRange();
        public SimpleList<State> askState();
        public SimpleList<County> askCounty();
        public SimpleList<City> askCity();
    }
}