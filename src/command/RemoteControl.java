package command;

import command.impl.NoOpCommand;

/**
 * 遥控器
 *
 * 既是接收者，也是触发者
 *
 * @author liupf
 * @date 2020-05-31 16:47
 */
public class RemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noOpCommand = new NoOpCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noOpCommand;
            offCommands[i] = noOpCommand;
        }
    }

    public void setCommad(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }
}
