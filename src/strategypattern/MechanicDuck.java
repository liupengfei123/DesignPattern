package strategypattern;

import strategypattern.fly.FlyWithPropeller;

/**
 * @author liupf
 * @date 2020-05-10 13:52
 */
public class MechanicDuck extends Duck{
    public MechanicDuck(){
        //在创建飞行行为类是可以使用工厂模式，或者在创建这个鸭子对象可以使用工厂模式
        this.setFlyBehavior(new FlyWithPropeller());
    }

    public void display(){
        System.out.println("机械鸭子");
    }
}
