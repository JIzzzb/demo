package com.model.commandModel.client;

import com.model.commandModel.GarageDoorOpenCommand;
import com.model.commandModel.LightOnCommand;
import com.model.commandModel.invoker.SingleRemoteController;
import com.model.commandModel.receiver.GarageDoor;
import com.model.commandModel.receiver.Light;

public class RemoteControllerTest {
    public static void main(String[] args) {
        Light light = new Light("test");
        GarageDoor garageDoor = new GarageDoor();

        SingleRemoteController remote = new SingleRemoteController();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();
        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();

    }
}
