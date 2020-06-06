package command.pojo;

/**
 * @author liupf
 * @date 2020-05-31 16:50
 */
public class Light {

    private String name;

    public Light (String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " 灯开了");
    }

    public void off() {
        System.out.println(name + " 灯关了");
    }
}
