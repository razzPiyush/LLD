package Behavioral.ChainResponsibility;


public class Main {

    public static void main(String[] args) {

        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logObject.log(LogProcessor.ERROR, "exception happens");
        logObject.log(LogProcessor.DEBUG, "need to debug this ");
        logObject.log(LogProcessor.INFO, "just for info ");

    }
}

/*
Definition:
-The State Design Pattern is a behavioral pattern that allows an object to alter its behavior when its internal state changes. The object appears to change its class dynamically by delegating behavior to a corresponding state object.

When to Use:
-When an object needs to change its behavior based on its current state, and these state changes are frequent.
-To replace complex if-else or switch statements for handling different states.
-When you want to encapsulate different states in separate classes for better maintainability.

 */