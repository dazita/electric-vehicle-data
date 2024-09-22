package co.edu.uptc.views;

import co.edu.uptc.interfaces.iEVDContract;
import co.edu.uptc.interfaces.iEVDContract.Presenter;
import co.edu.uptc.views.MainFrame.MainFrame;

public class VehicleManagerView implements iEVDContract.View{
    private iEVDContract.Presenter presenter;
    private LoadingFrame loadingFrame;
    private MainFrame mainFrame;

    public VehicleManagerView(){
        loadingFrame = new LoadingFrame();
        mainFrame = new MainFrame();
    }


    @Override
    public void setPresenter(Presenter presenter) {
       this.presenter = presenter;
    }

    @Override
    public void begin() {
       mainFrame.makeVisible();
    }
    
}
