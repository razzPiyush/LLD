package ParkingLot;

import ParkingLot.ParkingSlot.ParkingSlotFactory;
import ParkingLot.vechicle.Vehicle;
import ParkingLot.vechicle.Car;
import ParkingLot.vechicle.Motorcycle;
import ParkingLot.vechicle.Truck;


public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance(100);
        ParkingSlotFactory parkingSlotFactory = new ParkingSlotFactory();
        // single instance of parkingLot is created 
        for(int i=0; i<3; i++){
            if(i%3==0){
                parkingLot.addParkingSlot(parkingSlotFactory.createParkingSlotType("Car", i));
            }
            else if(i%3==1){
                parkingLot.addParkingSlot(parkingSlotFactory.createParkingSlotType("Motorcycle", i));
            }
            else{
                parkingLot.addParkingSlot(parkingSlotFactory.createParkingSlotType("Truck", i));
            }
        }
        Car car = new Car("BRXX002");
        Vehicle bike = new Motorcycle("BRFGRG");
        Vehicle truck = new Truck("BRRGEG");
        Vehicle car1 = new Car("BRXX001");
        parkingLot.newVehicle(car);
        parkingLot.newVehicle(car1);
        parkingLot.newVehicle(bike);
        parkingLot.leaveVechicle(bike);
        parkingLot.newVehicle(truck);
        parkingLot.leaveVechicle(car);
    }
}
