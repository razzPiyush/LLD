package Creational.Factory;

// Usage
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        // here what we are doing is 
        // instead of creating objects of circle, rectange, seperately
        // we are initiating with the help of shapefactory class
    }
}
/*
Definition:
The Factory design pattern is a creational pattern that provides a way to create objects without specifying the exact
class of the object being created. Instead, it relies on a factory method to create and return instances of classes
that implement a common interface or base class.

When to Use:
-When the exact type of the object to be created depends on some condition or input, and this decision is required to be
centralized.
-When object creation logic becomes complex and you want to encapsulate it.
-When a class cannot anticipate the type of objects it needs to create.
 */