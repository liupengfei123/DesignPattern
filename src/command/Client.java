package command;

import command.impl.LightOffCommand;
import command.impl.LightOnCommand;
import command.impl.StereoOffCommand;
import command.impl.StereoOnCommand;
import command.pojo.Light;
import command.pojo.Stereo;

/**
 * @author liupf
 * @date 2020-05-31 17:03
 */
public class Client {
    public static void main(String[] args) {
        Light light1 = new Light("1号");
        Light light2 = new Light("2号");
        Light light3 = new Light("3号");

        Stereo stereo1 = new Stereo("1号");
        Stereo stereo2 = new Stereo("2号");

        Command lightOnCommand1 = new LightOnCommand(light1);
        Command lightOnCommand2 = new LightOnCommand(light2);
        Command lightOnCommand3 = new LightOnCommand(light3);

        Command lightOffCommand1 = new LightOffCommand(light1);
        Command lightOffCommand2 = new LightOffCommand(light2);
        Command lightOffCommand3 = new LightOffCommand(light3);

        Command stereoOffCommand1 = new StereoOffCommand(stereo1);
        Command stereoOffCommand2 = new StereoOffCommand(stereo2);

        Command stereoOnCommand1 = new StereoOnCommand(stereo1);
        Command stereoOnCommand2 = new StereoOnCommand(stereo2);


        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommad(1, lightOnCommand1, lightOffCommand1);
        remoteControl.setCommad(2, lightOnCommand2, lightOffCommand2);
        remoteControl.setCommad(3, lightOnCommand3, lightOffCommand3);
        remoteControl.setCommad(4, stereoOnCommand1, stereoOffCommand1);
        remoteControl.setCommad(5, stereoOnCommand2, stereoOffCommand2);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);

        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);

        remoteControl.onButtonWasPushed(5);
        remoteControl.offButtonWasPushed(5);
    }
}
