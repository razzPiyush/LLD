package LLD.Creational.Builder;

// Usage
public class Main {
    public static void main(String[] args) {
        HouseBuilder builder = new ConcreteHouseBuilder();
        ConstructionEngineer engineer = new ConstructionEngineer(builder);

        House house = engineer.constructHouse();
        house.setWalls("plastic walls"); 
        // we can instatinate multiple objects with different parameters dyamnically,
        // like we have to make all possible combinanation of constructors to instantinate object

        // if we want we can simply make an interface of house
        // then make concrete class having multiple constructos to initalize the objects
        // but not useful for very large parameters
        System.out.println(house);
    }
}