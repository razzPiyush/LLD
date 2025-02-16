package ParkingLot.vechicle;

public abstract class Vehicle {
    String vechileNumber;

    public Vehicle(String vechileNumber){
        this.vechileNumber = vechileNumber;
    }

    public String getVehicleNumber(){
        return this.vechileNumber;
    }
}
