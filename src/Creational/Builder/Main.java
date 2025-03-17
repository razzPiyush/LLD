package Creational.Builder;

// Usage
public class Main {
    public static void main(String[] args) {
        HouseBuilder builder = new ConcreteHouseBuilder();
        ConstructionEngineer engineer = new ConstructionEngineer(builder);
        // ConstructionEngineer - This class orchestrates the house-building process. It uses the builder object to call
        // the necessary methods in the correct sequence.
        // Flexibility: We can easily create different types of houses by introducing new builder implementations
        // (e.g., WoodenHouseBuilder, LuxuryHouseBuilder). The engineer doesn't need to know the details of these
        // builders. It simply uses the builder interface.
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

/*
Definition:
The Builder design pattern is a creational pattern that provides a way to construct complex objects step by step. It
separates the construction process from the representation, allowing the same construction process to create different
representations.

When to Use:
-When an object has numerous optional attributes or configurations.
-When the construction process is complex and needs to be isolated from the object's representation.
-When you want to ensure immutability after the object is constructed.
 */