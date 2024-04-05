
 public class Motorcycle extends Vehicle {
    private int numberOfWheels;
    private boolean isSportBike;

    public Motorcycle(String make, String model, int numberOfWheels, boolean isSportBike) {
        super(make, model);
        this.numberOfWheels = numberOfWheels;
        this.isSportBike = isSportBike;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public boolean isSportBike() {
        return isSportBike;
    }

    public void accelerate() {
        System.out.println("The motorcycle is accelerating...");
    }

    public void brake() {
        System.out.println("The motorcycle is braking...");
    }
}

 class Vehicle {
     public Vehicle(String make, String model) {


     }
 }