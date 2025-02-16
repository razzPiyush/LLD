package Behavioral.NullObject;

public class Main {
    public static void main(String[] args) {
        Vehicle suv = VehicleFactory.getVehicle("SUV");
        System.out.println(suv.getDetails());
        suv.drive();

        Vehicle unknown = VehicleFactory.getVehicle("Truck");
        System.out.println(unknown.getDetails());
        unknown.drive();
    }
}
