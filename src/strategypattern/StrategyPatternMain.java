package strategypattern;

/**
 * 测试策略模式
 *
 * @author liupf
 * @date 2020-05-10 13:56
 */
public class StrategyPatternMain {

    public static void main(String[] args) {

        Duck redheadDuck = new RedheadDuck();
        Duck mechanicDuck = new MechanicDuck();

        redheadDuck.display();
        redheadDuck.performFly();

        mechanicDuck.display();
        mechanicDuck.performFly();
    }
}
