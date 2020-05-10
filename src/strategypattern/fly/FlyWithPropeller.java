package strategypattern.fly;

/**
 *  使用螺旋桨起飞
 * @author liupf
 * @date 2020-05-10 13:48
 */
public class FlyWithPropeller implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("使用螺旋桨起飞");
    }
}
