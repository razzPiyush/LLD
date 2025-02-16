package ParkingLot.ParkingSlot;

import ParkingLot.vechicle.Motorcycle;
import ParkingLot.vechicle.Vehicle;

public class MotorcycleParkingSpot extends ParkingSlot{
    public MotorcycleParkingSpot(int slotNumber){
        super(slotNumber);
    }
    public boolean canFitVechile(Vehicle vechile){
        return vechile instanceof Motorcycle;
    }

}
