package Structural.Proxy;

public class Main {
    public static void main(String[] args) {
        Database adminProxy = new DatabaseProxy("ADMIN");
        adminProxy.query("SELECT * FROM Users");

        Database userProxy = new DatabaseProxy("USER");
        userProxy.query("SELECT * FROM Users");
    }
}
