package Creational.AbstractFactory.ShapeFactory;

import Creational.AbstractFactory.shape.Circle;
import Creational.AbstractFactory.shape.Shape;
import Creational.AbstractFactory.shape.Square;

// Factory for 2D Shapes
public class TwoDShapeFactory implements ShapeFactory {
    public Shape createCircle() {
        return new Circle();
    }

    public Shape createSquare() {
        return new Square();
    }
}
