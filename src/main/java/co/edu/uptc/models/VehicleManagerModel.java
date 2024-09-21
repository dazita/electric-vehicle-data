package co.edu.uptc.models;

import co.edu.uptc.interfaces.iEVDContract;
import co.edu.uptc.interfaces.iEVDContract.Presenter;

public class VehicleManagerModel implements iEVDContract.Model{
    private iEVDContract.Presenter presenter;

    @Override
    public void setPresenter(Presenter presenter) {
       this.presenter = presenter;
    }
    
}
