package com.model.commandModel.invoker;

import com.model.commandModel.Command;

public class SingleRemoteController {
    Command slot;

    public SingleRemoteController() {
    }

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
