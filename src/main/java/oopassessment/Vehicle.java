package oopassessment;

public abstract class Vehicle extends Product{

    private int speed;
    private float price;
    private Engine engine;

    public static final float TAX_AMT = 0.10f;



    public Vehicle(String name, int speed, float price, Engine engine) {
        super(name);
        this.speed = speed;
        this.price = price;
        this.engine = engine;
    }
    public void printVehicleType(Vehicle vehicle){

    }
    public float getPriceAfterDiscounts(Vehicle vehicle){
        float discountPrice = vehicle.getPrice() * TAX_AMT;
        float calculatedPrice = vehicle.getPrice() - discountPrice;
        return calculatedPrice;
    }

    public Vehicle(String name) {
        super(name);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
