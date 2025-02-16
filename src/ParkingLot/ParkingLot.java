package ParkingLot;

import java.util.*;
import ParkingLot.ParkingSlot.ParkingSlot;
import ParkingLot.vechicle.Vehicle;

public class ParkingLot {
    List<ParkingSlot> slots;
    int capacity;
    Map<Vehicle, ParkingSlot> vechileVsPakringSlot;

    // Applied Singelton pattern so that only one instnace of ParkingLot is created
    private static ParkingLot instance;

    private ParkingLot(int capacity) {
        this.slots = new ArrayList<>();
        this.capacity = capacity;
        vechileVsPakringSlot = new HashMap<>();
    };

    public static ParkingLot getInstance(int capacity){
        if(instance==null){
            return new ParkingLot(capacity);
        }
        return instance;
    }

    public void newVehicle(Vehicle vehicle){
        // fnid the nerest parking slot which is freee
        boolean isEmptySlotPresnt = false;
        for(ParkingSlot slot : slots){
            if(slot!=null && !slot.isOcupied() && slot.canFitVechile(vehicle)){
                slot.parkedVehicle(vehicle);
                vechileVsPakringSlot.put(vehicle, slot);
                isEmptySlotPresnt = true;
                break;
            }  
        }
        if(!isEmptySlotPresnt){
            System.out.println("Sorry, no empty slot present for this vechile");
        }
    }

    public void leaveVechicle(Vehicle vehicle){
        ParkingSlot slot = vechileVsPakringSlot.get(vehicle);
        if(slot!=null && slot.isOcupied()){
            slot.freeSlot();
            vechileVsPakringSlot.remove(vehicle);
        }
        else{
            System.out.println("No, such vechile is parked");
        }
    }

    public List<ParkingSlot> getAvailableParkingSlots(){
        List<ParkingSlot> avialableParkingSlots = new ArrayList<>();
        for(ParkingSlot slot : slots){
            if(slot!=null && !slot.isOcupied()){
                slots.add(slot);
            }
        }
        return avialableParkingSlots;
    }

    public void addParkingSlot(ParkingSlot parkingSlot){
        if(slots.size() < this.capacity){
            slots.add(parkingSlot);
        }
        else{
            System.out.println("No space for adding new parking spot");
        }
    }

}
