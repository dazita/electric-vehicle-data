package co.edu.uptc.presenters;

import co.edu.uptc.interfaces.iEVDContract;
import co.edu.uptc.interfaces.iEVDContract.Model;
import co.edu.uptc.interfaces.iEVDContract.View;
import co.edu.uptc.pojos.CarModel;
import co.edu.uptc.pojos.City;
import co.edu.uptc.pojos.County;
import co.edu.uptc.pojos.ElectricRange;
import co.edu.uptc.pojos.Manufacturer;
import co.edu.uptc.pojos.State;
import co.edu.uptc.utilities.SimpleList;
import lombok.Getter;

@Getter
public class Presenter implements iEVDContract.Presenter{
    
    private iEVDContract.View view;
    private iEVDContract.Model model;

    @Override
    public void setView(View view) {
       this.view = view;
    }

    @Override
    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public void loadData() {
        model.loadData();
    }

    @Override
    public void showMainFrame() {
        view.showMainFrame();
    }

    @Override
    public SimpleList<CarModel> askCarModel() {
        return model.askCarModel();
    }

    @Override
    public SimpleList<Manufacturer> askManufacturer() {
        return model.askManufacturer();
    }

    @Override
    public SimpleList<ElectricRange> askElectricRange() {
        return model.askElectricRange();
    }

    @Override
    public SimpleList<State> askState() {
        return model.askState();
    }

    @Override
    public SimpleList<County> askCounty() {
        return model.askCounty();
    }

    @Override
    public SimpleList<City> askCity() {
        return model.askCity();
    }

    
}
