
  public class Vehicle {
    protected String make;
    protected String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void startEngine() {
        System.out.println("The engine is starting...");
    }

    public void stopEngine() {
        System.out.println("The engine is stopping...");
    }
}