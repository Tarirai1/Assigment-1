public class Main {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Iron 883", 2, true);
        motorcycle.startEngine();
        motorcycle.accelerate();
        System.out.println("Make: " + motorcycle.getMake() + ", Model: " + motorcycle.getModel() + ", Number of wheels: " + motorcycle.getNumberOfWheels() + ", Sport bike: " + motorcycle.isSportBike());

        Bus bus = new Bus("Volvo", "B12BLE", 50, true);
        bus.startEngine();
        bus.openDoors();
        System.out.println("Make: " + bus.getMake() + ", Model: " + bus.getModel() + ", Number of passengers: " + bus.getNumberOfPassengers() + ", Double decker: " + bus.isDoubleDecker());

        Trailer trailer = new Trailer("Great Dane", "Straight 20'", 20, true);
        trailer.startEngine();
        trailer.attachToTruck();
        System.out.println("Make: " + trailer.getMake() + ", Model: " + trailer.getModel() + ", Length: " + trailer.getLength() + ", Refrigerated: " + trailer.isRefrigerated());

        Boat boat = new Boat("Boston Whaler", "Montauk 170", 1, false);
        boat.startEngine();
        boat.setSail();
        System.out.println("Make: " + boat.getMake() + ", Model: " + boat.getModel() + ", Number of engines: " + boat.getNumberOfEngines() + ", Sailboat: " + boat.isSailboat());
    }
}

class motorcycle {
}

class Bus {
    public Bus(String volvo, String b12BLE, int i, boolean b) {

    }

    public void openDoors() {
    }

    public String getMake() {
        return "Volvo";
    }

    public void startEngine() {

    }

    public String getModel() {
        return "B12BLE";
    }

    public int getNumberOfPassengers() {
        return 50;
    }

    public boolean isDoubleDecker() {
        return true;
    }
}

class Trailer {
    public Trailer(String greatDane, String s, int i, boolean b) {

    }

    public void startEngine() {

    }

    public void attachToTruck() {

    }

    public String getMake() {
        return "Great Dane";
    }

    public String getModel() {
        return "Straight 20";
    }

    public int getLength() {
        return 20;
    }

    public boolean isRefrigerated() {
        return true;
    }
}

class Boat {
    public Boat(String bostonWhaler, String s, int i, boolean b) {

    }

    public void startEngine() {
    }

    public void setSail() {

    }

    public String getMake() {
        return "Boston Whaler";
    }

    public String getModel() {
        return "Montauk 170";
    }

    public int getNumberOfEngines() {
        return 1;
    }

    public boolean isSailboat() {
        return false;
    }
}

class Motorcycle {
    public Motorcycle(String s, String s1, int i, boolean b) {


    }

    public void accelerate() {


    }

    public void startEngine() {
    }

    public String getMake() {

        return "Harley-Davidson";
    }

    public String getModel() {
        return "Iron 883";
    }

    public int getNumberOfWheels() {
        return 2;
    }

    public boolean isSportBike() {
        return true;
    }
}