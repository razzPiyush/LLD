package Behavioral.NullObject;

public class NullVehicle implements Vehicle {
    @Override
    public void drive() {
        System.out.println("No vehicle available to drive.");
    }

    @Override
    public String getDetails() {
        return "No vehicle details available.";
    }
}
