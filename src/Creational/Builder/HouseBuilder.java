package Creational.Builder;

// Builder interface
interface HouseBuilder {
    void buildWalls();
    void buildRoof();
    void buildFoundation();
    House getHouse();
}