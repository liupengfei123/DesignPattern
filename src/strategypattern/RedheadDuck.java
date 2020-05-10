package strategypattern;

import strategypattern.fly.FlyWithWings;

/**
 * @author liupf
 * @date 2020-05-10 13:52
 */
public class RedheadDuck extends Duck{

    public RedheadDuck(){
        //在创建飞行行为类是可以使用工厂模式，或者在创建这个鸭子对象可以使用工厂模式
        this.setFlyBehavior(new FlyWithWings());
    }

    public void display(){
        System.out.println("红头鸭子");
    }
}
