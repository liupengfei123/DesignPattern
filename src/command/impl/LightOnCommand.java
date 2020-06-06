package command.impl;

import command.Command;
import command.pojo.Light;

/**
 * 开灯命令
 * @author liupf
 * @date 2020-05-31 16:49
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
