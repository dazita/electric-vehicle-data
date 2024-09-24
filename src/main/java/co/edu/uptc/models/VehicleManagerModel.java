package co.edu.uptc.models;

import java.util.List;

import co.edu.uptc.interfaces.iEVDContract;
import co.edu.uptc.interfaces.iEVDContract.Presenter;
import co.edu.uptc.pojos.VehicleData;

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
        //ApiConsumer ac = new ApiConsumer();
        //ac.consumeApi();
    }

    public VehicleData parseListToVehicle(List<Object> vehicle){
        VehicleData auxVehicle = new VehicleData();
        auxVehicle.setIdentifierSID((String) vehicle.get(0));
        auxVehicle.setIdentifierID((String) vehicle.get(1));
        auxVehicle.setPosition((Integer) vehicle.get(2));
        auxVehicle.setCreatedAtEpoch(convertEpochToLong(vehicle.get(3)));
        auxVehicle.setCreatedMeta((String) vehicle.get(4));
        auxVehicle.setUpdatedAtEpoch(convertEpochToLong(vehicle.get(5)));
        auxVehicle.setUpdatedMeta((String) vehicle.get(6));
        auxVehicle.setMeta((String) vehicle.get(7));
        auxVehicle.setVinNumber((String) vehicle.get(8));
        auxVehicle.setCounty((String) vehicle.get(9));
        auxVehicle.setCity((String) vehicle.get(10));
        auxVehicle.setState((String) vehicle.get(11));
        auxVehicle.setPostalCode((String) vehicle.get(12));
        auxVehicle.setModelYear((String) vehicle.get(13));
        auxVehicle.setManufacturer((String) vehicle.get(14));
        auxVehicle.setModel((String) vehicle.get(15));
        auxVehicle.setElectricVehicleType((String) vehicle.get(16));
        auxVehicle.setCleanFuelVehicleEligibility((String) vehicle.get(17));
        auxVehicle.setElectricRange(parseInteger(vehicle.get(18)));
        auxVehicle.setBaseMsrp(parseInteger(vehicle.get(19)));
        auxVehicle.setLegislativeDistrict((String) vehicle.get(20));
        auxVehicle.setDolVehicleId((String) vehicle.get(21));
        auxVehicle.setGeocodedLocation((String) vehicle.get(22));
        auxVehicle.setElectricUtility((String) vehicle.get(23));
        auxVehicle.setCensus2020Tract((String) vehicle.get(24));
        auxVehicle.setRegionsCounted(parseInteger(vehicle.get(25)));
        auxVehicle.setCongressionalDistrict(parseInteger(vehicle.get(26)));
        auxVehicle.setLegislativeDistrictBoundaryGIS(parseInteger(vehicle.get(27)));
        return auxVehicle;
    }


    private Long convertEpochToLong(Object value) {
        if (value instanceof Integer) {
            return ((Integer) value).longValue();
        } else if (value instanceof Long) {
            return (Long) value;
        }
        return null;
    }
}
