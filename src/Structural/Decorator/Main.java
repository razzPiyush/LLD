package Structural.Decorator;

// Usage
public class Main {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost of Simple Coffee: " + simpleCoffee.cost());

        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println("Cost of Coffee with Milk: " + milkCoffee.cost());

        Coffee sugarCoffe = new SugarDecorator(simpleCoffee);
        System.out.println("Cost of Coffee with Milk: " + sugarCoffe.cost());

        Coffee milkSugarCoffee = new SugarDecorator(milkCoffee);
        System.out.println("Cost of Coffee with Milk and Sugar: " + milkSugarCoffee.cost());

        // here we can make any combination according to our requirement
        // it can be a simple coffee, coffee with Milk, coffee with Sugar, coffee with Sugar+Milk
        // we can extend it to any possible permutation combinations
    }
}
/*
Definition:
The Decorator design pattern is a structural pattern that allows behavior to be added to an individual object, either
statically or dynamically, without affecting the behavior of other objects from the same class. This is done by
wrapping the object in a decorator class that provides additional functionality.

When to Use:
-When you want to add responsibilities to objects without modifying their code or subclassing.
-When you need different combinations of behaviors that can be applied to objects dynamically.
-When extending functionality via inheritance would lead to an explosion of subclasses.
 */