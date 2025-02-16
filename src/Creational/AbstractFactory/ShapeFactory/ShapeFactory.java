package Creational.AbstractFactory.ShapeFactory;

import Creational.AbstractFactory.shape.Shape;

// Abstract Factory: ShapeFactory
public interface ShapeFactory {
    Shape createCircle();
    Shape createSquare();
}