package co.edu.uptc.models;

import java.util.Comparator;
import co.edu.uptc.pojos.*;

public class StateComparator {
    
    public static Comparator<State> comparator = new Comparator<State>() {

        @Override
        public int compare(State o1, State o2) {
            return Integer.compare(o2.getRegisterAmount(), o1.getRegisterAmount());
        }

    };
}
