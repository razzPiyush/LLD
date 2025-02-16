package Creational.Singelton;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.showMessage();

        System.out.println("s1 and s2 are " + ((s1 == s2) ? "the same instance." : "different instances."));
    }
}
