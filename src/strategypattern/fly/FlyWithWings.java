package strategypattern.fly;

/**
 *  扇翅膀的飞
 * @author liupf
 * @date 2020-05-10 13:48
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("扇翅膀的飞");
    }
}
