package Creational.Builder;

public class ConcreteHouseBuilder implements HouseBuilder {
    private final House house;

    public ConcreteHouseBuilder() {
        this.house = new House();
    }

    public void buildWalls() {
        house.setWalls("Concrete Walls");
    }

    public void buildRoof() {
        house.setRoof("Concrete Roof");
    }

    public void buildFoundation() {
        house.setFoundation("Concrete Foundation");
    }

    public House getHouse() {
        return house;
    }
}
