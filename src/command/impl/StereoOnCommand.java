package command.impl;

import command.Command;
import command.pojo.Stereo;

/**
 * 关音响命令
 * @author liupf
 * @date 2020-05-31 16:49
 */
public class StereoOnCommand implements Command {

    private Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
    }
}
