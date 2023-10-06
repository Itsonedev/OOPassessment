package oopassessment;

import java.util.ArrayList;

public class VehicleApp {

    public static void printListOfVehicleNames(ArrayList<Vehicle> vehicleList){
        for (Vehicle vehicleNames:vehicleList) {
            String name = vehicleNames.getName();
            System.out.println(name);
        }

        public static void printListOfFlyableObjects(ArrayList<Flyable> flyableObjects){
            for (Flyable flyableObject: flyableObjects) {
                String name = flyableObject.getName();
                System.out.println(name);
            }




    }
}
