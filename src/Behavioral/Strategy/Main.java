package Behavioral.Strategy;

// Usage
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        
        // Paying with Credit Card
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9876"));
        cart.checkout(100);

        // Paying with PayPal
        cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
        cart.checkout(200);
    }
}
/*
Definition:
-The Strategy Design Pattern is a behavioral pattern that defines a family of algorithms, encapsulates each one in a
separate class, and makes them interchangeable. This pattern allows a client to choose a behavior (or algorithm)
at runtime without modifying the context in which it operates.

When to Use:
-When you have different ways to accomplish a task, and the choice of algorithm should be made dynamically at runtime.
-When you want to eliminate complex if-else or switch statements for algorithm selection.
-When you want to encapsulate algorithm logic in a modular way for easy maintenance and scalability.
 */