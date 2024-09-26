package co.edu.uptc.utilities;

import co.edu.uptc.pojos.*;

public class ListToObjectParser {
    
    public static Object[][] parseCity(SimpleList<City> list){
        Object[][] matrix = new Object[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            matrix[i][0] = list.get(i).getName();
            matrix[i][1] = list.get(i).getNumberOfVehicles();
        }
        return matrix;
    }

    public static Object[][] parseState(SimpleList<State> statesList){
        Object[][] statesMatrix = new Object[statesList.size()][2];
        for (int i = 0; i < statesList.size(); i++) {
            statesMatrix[i][0] = statesList.get(i).getName();
            statesMatrix[i][1] = statesList.get(i).getRegisterAmount();
        }
        return statesMatrix;
    }

    public static Object[][] parseCounty(SimpleList<County> list){
        Object[][] matrix = new Object[list.size()][3];
        for (int i = 0; i < list.size(); i++) {
            matrix[i][0] = list.get(i).getState();
            matrix[i][1] = list.get(i).getName();
            matrix[i][2] = list.get(i).getNumberOfVehicles();
        }
        return matrix;
    }

   

    public static Object[][] parseElectricRange(SimpleList<ElectricRange> list){
        Object[][] matrix = new Object[list.size()][3];
        for (int i = 0; i < list.size(); i++) {
            matrix[i][0] = list.get(i).getName();
            matrix[i][1] = list.get(i).getNumberOfVehicles();
        }
        return matrix;
    }

    public static Object[][] parseModel(SimpleList<CarModel> list){
        Object[][] matrix = new Object[list.size()][3];
        for (int i = 0; i < list.size(); i++) {
            matrix[i][0] = list.get(i).getName();
            matrix[i][1] = list.get(i).getNumberOfVehicles();
        }
        return matrix;
    }

    public static Object[][] parseManufacturer(SimpleList<Manufacturer> list){
        Object[][] matrix = new Object[list.size()][3];
        for (int i = 0; i < list.size(); i++) {
            matrix[i][0] = list.get(i).getName();
            matrix[i][1] = list.get(i).getNumberOfVehicles();
        }
        return matrix;
    }

}
