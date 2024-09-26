package co.edu.uptc.models;

import java.util.Comparator;

import co.edu.uptc.pojos.City;

public class CityComparator {
    
 public static Comparator<City> comparator = new Comparator<City>() {

        @Override
        public int compare(City o1, City o2) {
            return Integer.compare(o1.getNumberOfVehicles(), o2.getNumberOfVehicles());
        }
    }; 
}
