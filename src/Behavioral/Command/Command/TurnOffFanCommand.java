package Behavioral.Command.Command;

import Behavioral.Command.Devices.Fan;

// Concrete Command: TurnOffFanCommand
public class TurnOffFanCommand implements Command {
    private Fan fan;

    public TurnOffFanCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.turnOff();
    }

    @Override
    public void undo() {
        fan.turnOn();
    }
}