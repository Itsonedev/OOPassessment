package oopassessment;

public class Car extends Vehicle implements Drivable{

    private int numberOfDoors;
    private float extraTax = 0.5f;
    public Car(String name, int speed, float price, Engine engine) {
        super(name, speed, price, engine);
    }

    public Car(String name) {
        super(name);
    }

    public void printNumberOfDoors(){
        System.out.println(getNumberOfDoors());
    }

    @Override
    public void printSpeed() {
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
