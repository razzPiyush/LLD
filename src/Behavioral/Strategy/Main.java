package LLD.Behavioral.Strategy;

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