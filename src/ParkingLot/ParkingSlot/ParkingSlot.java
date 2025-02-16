package ParkingLot.ParkingSlot;

import ParkingLot.vechicle.Vehicle;

public abstract class ParkingSlot {
    
    int slotNumber;
    boolean isOccupied;
    Vehicle vehicle;

    public ParkingSlot(int slotNumber){
        this.slotNumber = slotNumber;
        this.isOccupied = false;
        this.vehicle = null;
    }

    public boolean isOcupied(){
        return this.isOccupied;
    }

    public void freeSlot(){
        this.isOccupied = false;
        this.vehicle = null;
        System.out.println("Slot number " + this.slotNumber + " is now free." );
    }

    public void parkedVehicle(Vehicle vehicle){
        this.isOccupied = true;
        this.vehicle = vehicle;
        System.out.println("Vecicle number" + vehicle.getVehicleNumber() + " is parked in slot no "
            + this.slotNumber);
    }

    public abstract boolean canFitVechile(Vehicle vehicle);

}
