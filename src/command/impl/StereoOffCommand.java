package command.impl;

import command.Command;
import command.pojo.Stereo;

/**
 * 关音响命令
 * @author liupf
 * @date 2020-05-31 16:49
 */
public class StereoOffCommand implements Command {

    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
