package co.edu.uptc.presenters;

import co.edu.uptc.interfaces.iEVDContract;
import co.edu.uptc.interfaces.iEVDContract.Model;
import co.edu.uptc.interfaces.iEVDContract.View;
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
}
