package Creational.Singelton;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.showMessage();

        System.out.println("s1 and s2 are " + ((s1 == s2) ? "the same instance." : "different instances."));
    }
}
/*
Definition:
The Singleton design pattern ensures that a class has only one instance and provides a global point of access to
that instance. This is achieved by restricting the instantiation of the class and ensuring the instance is shared.

When to Use:
- When you need to control access to a shared resource, such as a database connection, configuration settings, or logging
  mechanism.
- When having multiple instances of a class would lead to inconsistencies or unwanted behavior.
- When global access to a single instance is necessary
*/