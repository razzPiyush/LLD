package Structural.Proxy;

public class Main {
    public static void main(String[] args) {
        Database adminProxy = new DatabaseProxy("ADMIN");
        adminProxy.query("SELECT * FROM Users");

        Database userProxy = new DatabaseProxy("USER");
        userProxy.query("SELECT * FROM Users");
    }
}
/*
Definition:
The Proxy design pattern is a structural design pattern that provides a surrogate or placeholder for another object to
control access to it. A proxy can perform additional operations (e.g., access control, lazy initialization, logging)
before or after delegating a request to the actual object.

When to Use:
-When you need to control access to an object (e.g., for security or logging).
-When the actual object is resource-intensive to create or initialize, and you want to create it on-demand
(lazy initialization).
-When you want to add functionality to an object transparently, without modifying its code.

 */