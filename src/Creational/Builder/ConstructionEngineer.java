package LLD.Creational.Builder;

// Director
class ConstructionEngineer {
    private HouseBuilder houseBuilder;

    public ConstructionEngineer(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse() {
        houseBuilder.buildFoundation();
        houseBuilder.buildWalls();
        houseBuilder.buildRoof();
        return houseBuilder.getHouse();
    }
}