package oopassessment;

public class Truck extends Vehicle implements Drivable{
    public Truck(String name, int speed, float price, Engine engine) {
        super(name, speed, price, engine);
    }

    public Truck(String name) {
        super(name);
    }

    @Override
    public void printSpeed() {

    }
}
