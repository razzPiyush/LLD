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
The Chain of Responsibility (CoR) is a behavioral design pattern that allows a request to pass through a chain of
handlers. Each handler in the chain either processes the request or passes it to the next handler, without the sender
knowing which handler will process it.

When to Use:
-When a request may be processed by one or more handlers.
-To decouple the sender of a request from its potential receivers.
-When the chain of handlers can change dynamically or at runtime.
-To avoid multiple if-else or switch statements for handling requests.

 */