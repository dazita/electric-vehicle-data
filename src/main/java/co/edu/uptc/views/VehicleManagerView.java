package co.edu.uptc.views;

import co.edu.uptc.interfaces.iEVDContract;
import co.edu.uptc.interfaces.iEVDContract.Presenter;
import co.edu.uptc.pojos.CarModel;
import co.edu.uptc.pojos.City;
import co.edu.uptc.pojos.County;
import co.edu.uptc.pojos.ElectricRange;
import co.edu.uptc.pojos.Manufacturer;
import co.edu.uptc.pojos.State;
import co.edu.uptc.utilities.SimpleList;
import co.edu.uptc.views.MainFrame.MainFrame;

public class VehicleManagerView implements iEVDContract.View{
    private iEVDContract.Presenter presenter;
    private LoadingFrame loadingFrame;
    private MainFrame mainFrame;

    public VehicleManagerView(){
        loadingFrame = new LoadingFrame();
        mainFrame = new MainFrame(this);
    }

    public void showGeoAnalisis(){
        mainFrame.showGeoAnalisis();
    }


    public void showCarAnalisis() {
        mainFrame.showCarAnalisis();
    }

    public void fillTables(){
        
    }

    @Override
    public void setPresenter(Presenter presenter) {
       this.presenter = presenter;
    }

    @Override
    public void begin() {
        loadingFrame.makeVisible();
        presenter.loadData();
        this.fillTables();
    }

    @Override
    public void showMainFrame(){
        loadingFrame.makeInvisible();
        mainFrame.makeVisible();
    }

    @Override
    public SimpleList<CarModel> askCarModel() {
        return presenter.askCarModel();
    }

    @Override
    public SimpleList<Manufacturer> askManufacturer() {
        return presenter.askManufacturer();
    }

    @Override
    public SimpleList<ElectricRange> askElectricRange() {
        return presenter.askElectricRange();
    }

    @Override
    public SimpleList<State> askState() {
        return presenter.askState();
    }

    @Override
    public SimpleList<County> askCounty() {
        return presenter.askCounty();
    }

    @Override
    public SimpleList<City> askCity() {
        return presenter.askCity();
    }
    
}
