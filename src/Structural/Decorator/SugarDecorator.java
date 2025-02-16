package LLD.Structural.Decorator;

class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public double cost() {
        return decoratedCoffee.cost() + 0.5;
    }
}
