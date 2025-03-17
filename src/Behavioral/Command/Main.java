package Behavioral.Command;

public class Main {
    public static void main(String[] args) {

        // Invoker
        RemoteControl remote = new RemoteControl();

        // Execute commands
        remote.executeCommand(remote.turnOnLight); // Output: The light is on.
        remote.executeCommand(remote.turnOnFan);   // Output: The fan is on.
        remote.executeCommand(remote.turnOffLight);
        remote.executeCommand(remote.turnOnLight);
        // Undo commands
        remote.undo(); // Output: The fan is off.
        remote.undo(); // Output: The light is off.
        remote.undo();
        remote.undo();
    }
}
/*
Definition:
-The Command Design Pattern is a behavioral pattern that encapsulates a request as an object, thereby allowing you to
parameterize clients with different requests, delay their execution, or support undoable operations.

When to Use:
-When you need to encapsulate method calls, requests, or operations as objects.
-When the sender of a request should be decoupled from the object that processes the request.
-Undo/Redo Functionality: When you need to implement undoable actions.
-When you want to group several commands into one.
 */