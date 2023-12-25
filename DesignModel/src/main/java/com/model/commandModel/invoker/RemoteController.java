package com.model.commandModel.invoker;

import com.model.commandModel.Command;
import com.model.commandModel.NoCommand;

public class RemoteController {
    private final Command[] onCommands;
    private final Command[] offCommands;
    private Command undoCommand;

    public RemoteController() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    //Physical Remote ,so don`t need to judge
    public void setCommands(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n-----------------Remote Controller------------\n");
        for (int i = 0; i < onCommands.length; i++) {
            sb.append("slot[" + i + "] " + onCommands[i].getClass().getSimpleName()
                    + "     " + offCommands[i].getClass().getSimpleName() + "\n");
        }
        sb.append("undoCommand = " + undoCommand.getClass().getSimpleName() + "\n");
        return sb.toString();
    }
}
