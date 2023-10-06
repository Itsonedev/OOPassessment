package oopassessment;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Plane seven47 = new Plane("747",400, 150000f, new Engine(Size.LARGE));
        Car porsche = new Car("Porsche 911",200, 90000f, new Engine(Size.SMALL));
        Truck fordPickup = new Truck("Ford F150",170, 80000f, new Engine(Size.MEDIUM));
        Boat speedBoat = new Boat("Wave Runner",220, 100000f, new Engine(Size.LARGE));
        FlyingCar futureWheels = new FlyingCar("X Series 9",350, 200000f, new Engine(Size.LARGE));
        Drone drone = new Drone("Flyer 420");

        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(seven47);
        vehicleList.add(porsche);
        vehicleList.add(fordPickup);
        vehicleList.add(speedBoat);
        vehicleList.add(futureWheels);

        VehicleApp vehicleApp = new VehicleApp();
        vehicleApp.printListOfVehicleNames(vehicleList);

        ArrayList<Flyable> flyableObjects = new ArrayList<>();
        flyableObjects.add(seven47);
        flyableObjects.add(futureWheels);
        flyableObjects.add(drone);



        //Hash Map Passengers






    }
}
