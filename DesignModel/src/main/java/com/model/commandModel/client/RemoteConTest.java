package com.model.commandModel.client;

import com.model.commandModel.CeilingFanHighCommand;
import com.model.commandModel.CeilingFanMediumCommand;
import com.model.commandModel.CeilingFanOffCommand;
import com.model.commandModel.invoker.RemoteController;
import com.model.commandModel.receiver.CeilingFan;
import com.model.commandModel.receiver.Light;

public class RemoteConTest {
    public static void main(String[] args) {
        //receiver
        CeilingFan fan = new CeilingFan("Living Room");
        //invoker
        RemoteController controller = new RemoteController();
        //command
        CeilingFanHighCommand highCommand = new CeilingFanHighCommand(fan);
        CeilingFanMediumCommand mediumCommand = new CeilingFanMediumCommand(fan);
        CeilingFanOffCommand offCommand = new CeilingFanOffCommand(fan);

        controller.setCommands(0, highCommand, offCommand);
        controller.setCommands(1, mediumCommand, offCommand);
        controller.onButtonWasPushed(0);
        controller.offButtonWasPushed(0);
        System.out.println(controller);
        controller.undoButtonWasPushed();

        controller.onButtonWasPushed(1);
        System.out.println(controller);
        controller.undoButtonWasPushed();
    }
}
