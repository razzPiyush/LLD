package LLD.Creational.Factory;

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