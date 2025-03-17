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
/*
-The Null Object Design Pattern is a behavioral design pattern that provides a default or "do-nothing" behavior in place
of null references. It avoids null checks in the code by creating an object with a neutral (non-impactful) behavior.

When to Use:
-When you want to eliminate repetitive if (object != null) checks in the code.
-When you need a default implementation that doesn’t affect the overall functionality.
-When you want to treat null as a valid object with a neutral behavior, ensuring seamless interaction with other objects.
 */