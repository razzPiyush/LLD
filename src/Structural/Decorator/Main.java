package LLD.Structural.Decorator;

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

        // here we can make any combination according to our reuirement
        // it can be a simple coffee, coffee with Milk, coffee with Sugar, coffee with Sugar+Milk
        // we can extend it to any possible permutation combinations
    }
}