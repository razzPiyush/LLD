package Behavioral.Command.Command;

import Behavioral.Command.Devices.Fan;

// Concrete Command: TurnOnFanCommand
public class TurnOnFanCommand implements Command {
    private Fan fan;

    public TurnOnFanCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.turnOn();
    }

    @Override
    public void undo() {
        fan.turnOff();
    }
}