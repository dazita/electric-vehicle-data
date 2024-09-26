package co.edu.uptc.pojos;
import lombok.Data;

@Data
public class VehicleData{
    private String vinNumber;
    private String county;
    private String city;
    private String state;
    private String postalCode;
    private String modelYear;
    private String manufacturer;
    private String model;
    private String electricVehicleType;
    private String cleanFuelVehicleEligibility;
    private Integer electricRange;
    private Integer baseMsrp;
    private String legislativeDistrict;
    private String dolVehicleId;
    private String geocodedLocation;
    private String electricUtility;
}
