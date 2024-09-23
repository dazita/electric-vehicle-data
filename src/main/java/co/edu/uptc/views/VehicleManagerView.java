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
        mainFrame = new MainFrame(this);
    }

    public void showGeoAnalisis(){
        mainFrame.showGeoAnalisis();
    }


    public void showCarAnalisis() {
        mainFrame.showCarAnalisis();
    }

    @Override
    public void setPresenter(Presenter presenter) {
       this.presenter = presenter;
    }

    @Override
    public void begin() {
        loadingFrame.makeVisible();
        presenter.loadData();
        showMainFrame();
    }

    public void showMainFrame(){
        loadingFrame.makeInvisible();
        mainFrame.makeVisible();
    }
    
}
