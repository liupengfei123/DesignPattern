package command.pojo;

/**
 * @author liupf
 * @date 2020-05-31 16:50
 */
public class Stereo {

    private String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " 音响开了");
    }

    public void off() {
        System.out.println(name + " 音响关了");
    }

}
