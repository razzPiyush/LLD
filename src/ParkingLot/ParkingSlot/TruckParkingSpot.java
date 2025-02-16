package ParkingLot.ParkingSlot;

import ParkingLot.vechicle.Truck;
import ParkingLot.vechicle.Vehicle;

public class TruckParkingSpot extends ParkingSlot{
    public TruckParkingSpot(int vechileNumber){
        super(vechileNumber);
    }

    public boolean canFitVechile(Vehicle vehicle){
        return vehicle instanceof Truck;
    }
}
