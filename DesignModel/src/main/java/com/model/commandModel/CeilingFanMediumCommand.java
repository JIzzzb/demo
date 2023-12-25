package com.model.commandModel;

import com.model.commandModel.receiver.CeilingFan;

public class CeilingFanMediumCommand implements Command {
    CeilingFan fan;
    int prevSpeed;

    public CeilingFanMediumCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        prevSpeed = fan.getSpeed();
        fan.medium();
    }

    @Override
    public void undo() {
        switch (prevSpeed) {
            case CeilingFan.HIGH:
                fan.high();
                break;
            case CeilingFan.MEDIUM:
                fan.medium();
                break;
            case CeilingFan.LOW:
                fan.low();
                break;
            default:
                fan.off();
        }
    }
}
