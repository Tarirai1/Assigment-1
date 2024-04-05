public class Bus extends Vehicle {
    private int numberOfPassengers;
    private boolean isDoubleDecker;

    public Bus(String make, String model, int numberOfPassengers, boolean isDoubleDecker) {
        super(make, model);
        this.numberOfPassengers = numberOfPassengers;
        this.isDoubleDecker = isDoubleDecker;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public boolean isDoubleDecker() {
        return isDoubleDecker;
    }

    public void openDoors() {
        System.out.println("The bus doors are opening...");
    }

    public void closeDoors() {
        System.out.println("The bus doors are closing...");
    }
}

class Vehicle {
    public Vehicle(String make, String model) {


    }
}