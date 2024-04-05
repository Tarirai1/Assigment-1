public class Boat extends Vehicle {
    private int numberOfEngines;
    private final boolean isSailboat;

    public Boat(String make, String model, int numberOfEngines, boolean isSailboat) {
        super(make, model);
        this.numberOfEngines = numberOfEngines;
        this.isSailboat = isSailboat;
    }

    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    public boolean isSailboat() {
        return isSailboat;
    }

    public void setSail() {
        System.out.println("The boat is setting sail...");
    }

    public void startMotor() {
        System.out.println("The boat's motor is starting...");
    }
}

class Vehicle {
    public Vehicle(String make, String model) {


    }
}