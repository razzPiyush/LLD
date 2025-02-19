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