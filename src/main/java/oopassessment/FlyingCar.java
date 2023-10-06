package oopassessment;

public class FlyingCar extends Vehicle implements Flyable,Drivable{
    public FlyingCar(String name, int speed, float price, Engine engine) {
        super(name, speed, price, engine);
    }

    public FlyingCar(String name) {
        super(name);
    }

    @Override
    public void printSpeed() {

    }

    @Override
    public boolean transportsPassengers() {
        return false;
    }
}
