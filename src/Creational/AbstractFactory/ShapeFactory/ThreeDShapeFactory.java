package Creational.AbstractFactory.ShapeFactory;

import Creational.AbstractFactory.shape.Cube;
import Creational.AbstractFactory.shape.Shape;
import Creational.AbstractFactory.shape.Sphere;

// Factory for 3D Shapes
public class ThreeDShapeFactory implements ShapeFactory {
    public Shape createCircle() {
        return new Sphere(); // Sphere as a 3D equivalent of Circle
    }

    public Shape createSquare() {
        return new Cube(); // Cube as a 3D equivalent of Square
    }
}

