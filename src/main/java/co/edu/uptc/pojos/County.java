package co.edu.uptc.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class County {
    private String state;
    private String name;
    private int numberOfVehicles;
}
