package co.edu.uptc.views;

import co.edu.uptc.interfaces.iEVDContract;
import co.edu.uptc.interfaces.iEVDContract.Presenter;

public class VehicleManagerView implements iEVDContract.View{
    private iEVDContract.Presenter presenter;
    private LoadingFrame loadingFrame;

    public VehicleManagerView(){
        loadingFrame = new LoadingFrame();
    }


    @Override
    public void setPresenter(Presenter presenter) {
       this.presenter = presenter;
    }

    @Override
    public void begin() {
       loadingFrame.makeVisible();
    }
    
}
