package strategypattern;

import strategypattern.fly.FlyBehavior;

/**
 * @author liupf
 * @Date 2020-05-10 13:47
 */
public class Duck {

    private FlyBehavior flyBehavior;

    public void display(){
        System.out.println("普通鸭子");
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
