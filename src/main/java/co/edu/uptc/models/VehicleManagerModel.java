package co.edu.uptc.models;

import co.edu.uptc.interfaces.iEVDContract;
import co.edu.uptc.interfaces.iEVDContract.Presenter;
import co.edu.uptc.utilities.ApiConsumer;

public class VehicleManagerModel implements iEVDContract.Model{
    private iEVDContract.Presenter presenter;

    public VehicleManagerModel(){
    }

    @Override
    public void setPresenter(Presenter presenter) {
       this.presenter = presenter;
    }

    @Override
    public void loadData(){
        ApiConsumer ac = new ApiConsumer();
        ac.consumeApi();
    }
}
