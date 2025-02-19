package Behavioral.Command;

// Invoker: RemoteControl
import Behavioral.Command.Command.*;
import Behavioral.Command.Devices.Fan;
import Behavioral.Command.Devices.Light;

import java.util.Stack;

public class RemoteControl {

    Light livingRoomLight;
    Fan ceilingFan;
    Command turnOnLight;
    Command turnOffLight;
    Command turnOnFan;
    Command turnOffFan;

    public RemoteControl(){
        livingRoomLight = new Light();
        ceilingFan = new Fan();

        // Commands
        turnOnLight = new TurnOnLightCommand(livingRoomLight);
        turnOffLight = new TurnOffLightCommand(livingRoomLight);
        turnOnFan = new TurnOnFanCommand(ceilingFan);
        turnOffFan = new TurnOffFanCommand(ceilingFan);
    }

    private Stack<Command> history = new Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
    }

    public void undo() {
        if (!history.isEmpty()) {
            Command command = history.pop();
            command.undo();
        }
    }
}