package Behavioral.NullObject;

public class Car implements Vehicle {
    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Driving a " + make + " " + model);
    }

    @Override
    public String getDetails() {
        return "Car: " + make + " " + model;
    }
}
