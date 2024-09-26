package co.edu.uptc.utilities;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import co.edu.uptc.pojos.VehicleData;

public class VehicleReader{

    SimpleList<VehicleData> dataList;

    public SimpleList<VehicleData> readData(){
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            URL url = new URL("https://data.wa.gov/api/views/f6w7-q2d2/rows.json");

            JsonNode rootNode = objectMapper.readTree(url);

            JsonNode dataNode = rootNode.get("data");

            dataList = new SimpleList<VehicleData>();

            if (dataNode.isArray()) {
                for (JsonNode arrayNode : dataNode) {
                    Iterator<JsonNode> elements = arrayNode.elements();
                    VehicleData data = new VehicleData();
                    for (int i = 0; i < 8; i++) {
                        elements.next();
                    }
                    data.setVinNumber(elements.next().asText());
                    data.setCounty(elements.next().asText());
                    data.setCity(elements.next().asText());
                    data.setState(elements.next().asText());
                    data.setPostalCode(elements.next().asText());
                    data.setModelYear(elements.next().asText());
                    data.setManufacturer(elements.next().asText());
                    data.setModel(elements.next().asText());
                    data.setElectricVehicleType(elements.next().asText());
                    data.setCleanFuelVehicleEligibility(elements.next().asText());
                    data.setElectricRange(elements.next().intValue());
                    data.setBaseMsrp(elements.next().intValue());
                    data.setLegislativeDistrict(elements.next().asText());
                    data.setDolVehicleId(elements.next().asText());
                    data.setGeocodedLocation(elements.next().asText());
                    data.setElectricUtility(elements.next().asText());

                    dataList.add(data);
                }
            }

            return dataList;

        } catch (IOException e) {
            e.printStackTrace();
            
        }
        return null;
    }
}