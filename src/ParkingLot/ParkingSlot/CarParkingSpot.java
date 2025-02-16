package ParkingLot.ParkingSlot;

import ParkingLot.vechicle.Car;
import ParkingLot.vechicle.Vehicle;

public class CarParkingSpot extends ParkingSlot{
    public CarParkingSpot(int vechileNumber){
        super(vechileNumber);
    }
    
    public boolean canFitVechile(Vehicle vehicle){
        return vehicle instanceof Car;
    }
}
