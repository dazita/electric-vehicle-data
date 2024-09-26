package co.edu.uptc.models;

import java.util.Collections;

import co.edu.uptc.interfaces.iEVDContract;
import co.edu.uptc.interfaces.iEVDContract.Presenter;
import co.edu.uptc.pojos.*;
import co.edu.uptc.utilities.*;


public class VehicleManagerModel implements iEVDContract.Model{
    private SimpleList<VehicleData> vehicles;
    private SimpleList<State> finalStates;
    
    private iEVDContract.Presenter presenter;

    public VehicleManagerModel(){
    }

    @Override
    public void setPresenter(Presenter presenter) {
       this.presenter = presenter;
    }

    @Override
    public void loadData(){
        VehicleReader vr = new VehicleReader();
        vehicles = vr.readData();
        loadStates();
    }

    private void loadStates(){
        getStates();
        countVehiclesByStates();
        sortStates();
    }

    private void getStates() {
        SimpleList<State> states = new SimpleList<>();
        for (int i = 0; i < vehicles.size(); i++) {
            State state = new State(vehicles.get(i).getState(), 0);
            if (!states.contains(state)) {
                states.add(state);
            }
        }
        finalStates = states;
    }

    private void countVehiclesByStates() {
        for (int i = 0; i < finalStates.size(); i++) {
            State state = finalStates.get(i);
            String stateName = state.getName();
            for (int j = 0; j < vehicles.size(); j++) {
                if(vehicles.get(j).getState().equals(stateName));
                state.setRegisterAmount(state.getRegisterAmount() + 1);
            }
        }
    }

    private void sortStates(){
        Collections.sort(finalStates, StateComparator.comparator);
    }
    
    private void getCounties(){
        SimpleList<State> counties = new SimpleList<>();
        for (int i = 0; i < vehicles.size(); i++) {
            State state = new State(vehicles.get(i).getState(), 0);
            if (!states.contains(state)) {
                states.add(state);
            }
        }
        return states;
    }

    private void countVehiclesByCounty(){

    }

    private void sortCounties(){

    }
}
