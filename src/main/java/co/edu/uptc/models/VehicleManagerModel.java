package co.edu.uptc.models;

import java.util.Collections;

import co.edu.uptc.interfaces.iEVDContract;
import co.edu.uptc.interfaces.iEVDContract.Presenter;
import co.edu.uptc.models.Comparators.CityComparator;
import co.edu.uptc.models.Comparators.CountyComparator;
import co.edu.uptc.models.Comparators.ElectricRangesComparator;
import co.edu.uptc.models.Comparators.ManufacturerComparator;
import co.edu.uptc.models.Comparators.ModelComparator;
import co.edu.uptc.models.Comparators.StateComparator;
import co.edu.uptc.pojos.*;
import co.edu.uptc.utilities.*;
import lombok.Getter;

@Getter
public class VehicleManagerModel implements iEVDContract.Model {
    private SimpleList<VehicleData> vehicles;
    private SimpleList<State> finalStates;
    private SimpleList<County> finalCounties;
    private SimpleList<City> finalCities;
    private SimpleList<CarModel> finalModels;
    private SimpleList<Manufacturer> finalManufacturers;
    private SimpleList<ElectricRange> finalElectricRanges;


    private iEVDContract.Presenter presenter;

    public VehicleManagerModel() {
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void loadData() {
        VehicleReader vr = new VehicleReader();
        vehicles = vr.readData();
        loadStates();
        loadCounties();
        loadCities();
        loadModels();
        loadManufacturers();
        loadElectricRanges();
    }

    private void loadStates() {

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
                if (vehicles.get(j).getState().equals(stateName)) {
                    state.setRegisterAmount(state.getRegisterAmount() + 1);
                }
            }
        }
    }

    private void sortStates() {
        Collections.sort(finalStates, StateComparator.comparator);
    }

    private void loadCounties() {
        getCounties();
        countVehiclesByCounty();
        sortCounties();
    }

    private void getCounties() {
        SimpleList<County> counties = new SimpleList<>();
        for (int i = 0; i < vehicles.size(); i++) {
            County county = new County(vehicles.get(i).getState(), vehicles.get(i).getCounty(), 0);
            if (!counties.contains(county)) {
                counties.add(county);
            }
        }
        finalCounties = counties;
    }

    private void countVehiclesByCounty() {
        for (int i = 0; i < finalCounties.size(); i++) {
            County county = finalCounties.get(i);
            String countyName = county.getName();
            for (int j = 0; j < vehicles.size(); j++) {
                if (vehicles.get(j).getCounty().equals(countyName)) {
                    county.setNumberOfVehicles(county.getNumberOfVehicles() + 1);
                }
            }
        }
    }

    private void sortCounties() {
        Collections.sort(finalCounties, CountyComparator.comparator);
    }

    private void loadCities() {
        getCities();
        countVehiclesByCity();
        sortCities();
    }

    private void getCities() {
        SimpleList<City> cities = new SimpleList<>();
        for (int i = 0; i < vehicles.size(); i++) {
            City city = new City(vehicles.get(i).getCity(), 0);
            if (!cities.contains(city)) {
                cities.add(city);
            }
        }
        finalCities = cities;
    }

    private void countVehiclesByCity() {
        for (int i = 0; i < finalCities.size(); i++) {
            City city = finalCities.get(i);
            String cityName = city.getName();
            for (int j = 0; j < vehicles.size(); j++) {
                if (vehicles.get(j).getCity().equals(cityName)) {
                    city.setNumberOfVehicles(city.getNumberOfVehicles() + 1);
                }
            }
        }
    }

    private void sortCities() {
        Collections.sort(finalCities, CityComparator.comparator);
    }

    public SimpleList<City> citiesWithMoreRegisters() {
        SimpleList<City> cities = new SimpleList<>();
        cities.add(finalCities.get(0));
        for (int i = 1; i < finalCities.size(); i++) {
            if (finalCities.get(i).getNumberOfVehicles() == finalCities.get(0).getNumberOfVehicles()) {
                cities.add(finalCities.get(i));
            } else {
                break;
            }
        }
        return cities;
    }

    private void loadModels(){
        getModels();
        countVehiclesByModel();
        sortModels();
    }

    private void getModels() {
        SimpleList<CarModel> models = new SimpleList<>();
        for (int i = 0; i < vehicles.size(); i++) {
            CarModel model = new CarModel(vehicles.get(i).getModel(), 0);
            if (!models.contains(model)) {
                models.add(model);
            }
        }
        finalModels = models;
    }

    private void countVehiclesByModel() {
        for (int i = 0; i < finalModels.size(); i++) {
            CarModel model = finalModels.get(i);
            String modelName = model.getName();
            for (int j = 0; j < vehicles.size(); j++) {
                if (vehicles.get(j).getModel().equals(modelName)) {
                    model.setNumberOfVehicles(model.getNumberOfVehicles() + 1);
                }
            }
        }
    }

    private void sortModels() {
        Collections.sort(finalModels, ModelComparator.comparator);
    }


    private void loadManufacturers(){
        getManufacturers();
        countVehiclesByManufacturer();
        sortManufacturers();
    }

    private void getManufacturers() {
        SimpleList<Manufacturer> manufacturers = new SimpleList<>();
        for (int i = 0; i < vehicles.size(); i++) {
            Manufacturer manufacturer = new Manufacturer(vehicles.get(i).getModel(), 0);
            if (!manufacturers.contains(manufacturer)) {
                manufacturers.add(manufacturer);
            }
        }
        finalManufacturers = manufacturers;
    }

    private void countVehiclesByManufacturer() {
        for (int i = 0; i < finalManufacturers.size(); i++) {
            Manufacturer manufacturer = finalManufacturers.get(i);
            String manufacturerName = manufacturer.getName();
            for (int j = 0; j < vehicles.size(); j++) {
                if (vehicles.get(j).getManufacturer().equals(manufacturerName)) {
                    manufacturer.setNumberOfVehicles(manufacturer.getNumberOfVehicles() + 1);
                }
            }
        }
    }

    private void sortManufacturers() {
        Collections.sort(finalManufacturers, ManufacturerComparator.comparator);
    }



    private void loadElectricRanges(){
        getElectricRanges();
        countVehiclesByElectricRanges();
        sortElectricRanges();
    }

    private void getElectricRanges() {
        SimpleList<ElectricRange> electricRanges = new SimpleList<>();
        for (int i = 0; i < vehicles.size(); i++) {
            ElectricRange electricRange = new ElectricRange(vehicles.get(i).getModel(), 0);
            if (!electricRanges.contains(electricRange)) {
                electricRanges.add(electricRange);
            }
        }
        finalElectricRanges = electricRanges;
    }

    private void countVehiclesByElectricRanges() {
        for (int i = 0; i < finalElectricRanges.size(); i++) {
            ElectricRange electricRange = finalElectricRanges.get(i);
            String electricRangeName = electricRange.getName();
            for (int j = 0; j < vehicles.size(); j++) {
                if (vehicles.get(j).getElectricRange().equals(electricRangeName)) {
                    electricRange.setNumberOfVehicles(electricRange.getNumberOfVehicles() + 1);
                }
            }
        }
    }

    private void sortElectricRanges() {
        Collections.sort(finalElectricRanges, ElectricRangesComparator.comparator);
    }

    @Override
    public SimpleList<CarModel> askCarModel() {
        return finalModels;
    }

    @Override
    public SimpleList<Manufacturer> askManufacturer() {
        return finalManufacturers;
    }

    @Override
    public SimpleList<ElectricRange> askElectricRange() {
        return finalElectricRanges;
    }

    @Override
    public SimpleList<State> askState() {
        return finalStates;
    }

    @Override
    public SimpleList<County> askCounty() {
        return finalCounties;
    }

    @Override
    public SimpleList<City> askCity() {
        return finalCities;
    }

    


}
