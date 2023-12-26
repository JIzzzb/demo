package com.model.commandModel.client;

import com.model.commandModel.*;
import com.model.commandModel.invoker.RemoteController;
import com.model.commandModel.receiver.CeilingFan;
import com.model.commandModel.receiver.GarageDoor;
import com.model.commandModel.receiver.Light;

public class RemoteConTest2 {
    public static void main(String[] args) {
        Light light = new Light("Living Room");
        CeilingFan fan = new CeilingFan("Living Room");
        GarageDoor door = new GarageDoor();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        CeilingFanMediumCommand fanCommand = new CeilingFanMediumCommand(fan);
        GarageDoorOpenCommand doorCommand = new GarageDoorOpenCommand(door);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        CeilingFanOffCommand fanOffCommand = new CeilingFanOffCommand(fan);
        GarageDoorCloseCommand doorCloseCommand = new GarageDoorCloseCommand(door);
        Command[] onCommand = new Command[]{lightOnCommand, fanCommand, doorCommand};
        Command[] offCommand = new Command[]{lightOffCommand, fanOffCommand, doorCloseCommand};
        MacroCommand onCommand1 = new MacroCommand(onCommand);
        MacroCommand offCommand1 = new MacroCommand(offCommand);

        RemoteController controller = new RemoteController();
        controller.setCommands(0, onCommand1,offCommand1);
        System.out.println("-----------OnButton is pushed-----------");
        controller.onButtonWasPushed(0);
        System.out.println("-----------OffButton is pushed------------");
        controller.offButtonWasPushed(0);
        System.out.println(controller);
        System.out.println("----------UndoButton is pushed-------------");
        controller.undoButtonWasPushed();
    }
}
