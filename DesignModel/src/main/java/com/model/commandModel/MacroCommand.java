package com.model.commandModel;

//Commands Queue: 数组换为队列，批处理命令(宏命令)
//当一个请求发出后，不止一个接收者对其产生响应，这些接收者将逐个执行业务方法，完成对请求的处理，此时就可以通过命令队列来实现。
public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command : commands) {
            command.undo();
        }
    }
}
