package Behavioral.NullObject;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {
    private static Map<String, Vehicle> vehicles = new HashMap<>();

    static {
        vehicles.put("SUV", new Car("Toyota", "Highlander"));
        vehicles.put("Sedan", new Car("Honda", "Civic"));
    }

    public static Vehicle getVehicle(String type) {
        return vehicles.getOrDefault(type, new NullVehicle());
    }
}
