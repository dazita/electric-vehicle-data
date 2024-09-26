package co.edu.uptc.models;

import java.util.Comparator;
import co.edu.uptc.pojos.*;

public class CountyComparator {
    
    public static Comparator<County> comparator = new Comparator<County>() {

        @Override
        public int compare(County o1, County o2) {
            if (o1.getState().equals(o2.getState())){
                return Integer.compare(o1.getNumberOfVehicles(), o2.getNumberOfVehicles());
            } else {
                return o1.getState().compareTo(o2.getState());
            }
        }
        
    }; 
}
