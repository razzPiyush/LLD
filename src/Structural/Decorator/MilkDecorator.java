package LLD.Structural.Decorator;

// Concrete Decorators
class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public double cost() {
        return decoratedCoffee.cost() + 1.5;
    }
}