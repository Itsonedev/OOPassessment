package oopassessment;

public class Plane extends Vehicle implements Flyable{
    public Plane(String name, int speed, float price, Engine engine) {
        super(name, speed, price, engine);
    }

    public Plane(String name) {
        super(name);
    }

    @Override
    public boolean transportsPassengers() {
        return false;
    }
}
