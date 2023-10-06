package oopassessment;

public class Boat extends Vehicle implements Drivable{

    private boolean hasGPS;
    public Boat(String name, int speed, float price, Engine engine) {
        super(name, speed, price, engine);
    }

    public Boat(String name) {
        super(name);
    }
    public void printGpsInfo(){
        System.out.println(isHasGPS());
    }

    @Override
    public void printSpeed() {

    }

    public boolean isHasGPS() {
        return hasGPS;
    }

    public void setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }
}
