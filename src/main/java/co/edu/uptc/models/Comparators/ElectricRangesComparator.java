package co.edu.uptc.models.Comparators;

import java.util.Comparator;

import co.edu.uptc.pojos.*;

public class ElectricRangesComparator {
     
    public static Comparator<ElectricRange> comparator = new Comparator<ElectricRange>() {
        @Override
        public int compare(ElectricRange o1, ElectricRange o2) {
            return Integer.compare(o1.getNumberOfVehicles(), o2.getNumberOfVehicles());
        }
    };
}
