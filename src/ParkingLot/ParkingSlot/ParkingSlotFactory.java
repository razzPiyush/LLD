package ParkingLot.ParkingSlot;

public class ParkingSlotFactory {
    
    public ParkingSlot createParkingSlotType(String parkingSlotType, int slotNumber){
        if(parkingSlotType==null){
            return null;
        }
        if(parkingSlotType.equalsIgnoreCase("Car")){
            return new CarParkingSpot(slotNumber);
        }
        if(parkingSlotType.equalsIgnoreCase("Motorcycle")){
            return new MotorcycleParkingSpot(slotNumber);
        }
        if(parkingSlotType.equalsIgnoreCase("Truck")){
            return new TruckParkingSpot(slotNumber);
        }
        return null;
    }
}
