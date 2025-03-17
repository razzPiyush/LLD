package Creational.AbstractFactory;

import Creational.AbstractFactory.ShapeFactory.ShapeFactory;
import Creational.AbstractFactory.ShapeFactory.TwoDShapeFactory;
import Creational.AbstractFactory.shape.Shape;
import Creational.AbstractFactory.ShapeFactory.ThreeDShapeFactory;


public class Main {
    public static void main(String[] args) {
        // Get 2D Shape Factory
        ShapeFactory twoDFactory = new TwoDShapeFactory();
        Shape twoDCircle = twoDFactory.createCircle();
        Shape twoDSquare = twoDFactory.createSquare();

        twoDCircle.draw(); // Output: Drawing a Circle (2D).
        twoDSquare.draw(); // Output: Drawing a Square (2D).

        // Get 3D Shape Factory
        ShapeFactory threeDFactory = new ThreeDShapeFactory();
        Shape threeDCircle = threeDFactory.createCircle();
        Shape threeDSquare = threeDFactory.createSquare();

        threeDCircle.draw(); // Output: Drawing a Sphere (3D).
        threeDSquare.draw(); // Output: Drawing a Cube (3D).
    }
}
/*
Definition:
The Abstract Factory design pattern is a creational pattern that provides an interface to create families of related or
dependent objects without specifying their concrete classes. It encapsulates a group of individual factories with a
common theme.

When to Use:
-When you need to create families of related objects that must be used together.
-When the system needs to be independent of how its products are created, composed, and represented.
-When you want to enforce consistency among related objects.
-When the product families are expected to grow, and you want to ensure that adding new product families doesn’t affect
existing code.
 */