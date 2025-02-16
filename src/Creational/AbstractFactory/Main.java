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
