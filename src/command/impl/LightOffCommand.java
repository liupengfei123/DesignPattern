package command.impl;

import command.Command;
import command.pojo.Light;

/**
 * 关灯命令
 * @author liupf
 * @date 2020-05-31 16:49
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
