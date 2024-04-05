public class Trailer extends Vehicle {
    public int length;
    private final boolean isRefrigerated;

    public Trailer(String make, String model, int length, boolean isRefrigerated) {
        super();
        this.length = length;
        this.isRefrigerated = isRefrigerated;
    }

    public int getLength() {
        return length;
    }

    public boolean isRefrigerated() {
        return isRefrigerated;
    }

    public void attachToTruck() {
        System.out.println("The trailer is attaching to the truck...");
    }

    public void detachFromTruck() {
        System.out.println("The trailer is detaching from the truck...");
    }
}

class Vehicle {
}