package oopassessment;

import java.util.ArrayList;

public class VehicleApp {

    public void printListOfVehicleNames(ArrayList<Vehicle> vehicleList){
        for (Vehicle vehicleNames:vehicleList) {
            String name = vehicleNames.getName();
            System.out.println(name);
        }


    }
}
