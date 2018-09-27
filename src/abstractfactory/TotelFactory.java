package abstractfactory;

import abstractfactory.factory.DellFactoryA;
import abstractfactory.factory.DellFactoryB;
import abstractfactory.factory.LenovoFactoryA;
import abstractfactory.factory.LenovoFactoryB;

/**
 *  抽象工厂模式
 *
 *  将 工厂 看作 产品 而将建造的 大工厂
 *
 *   如是增加一个 “工厂” 只需创建新的工厂类 即可
 *   如需增加一个 产品（并每个工厂的可以生产，  如不是建议 单独 创建一个工厂模式）， 则需修改每一个工厂 Factory （）
 *
 */
public class TotelFactory {
    //使用简单工厂模式  创建工厂对象
    public static Factory getDellFactoryA(){
        return new DellFactoryA();
    }

    public static Factory getDellFactoryB(){
        return new DellFactoryB();
    }

    public static Factory getLenovoFactoryA(){
        return new LenovoFactoryA();
    }

    public static Factory getLenovoFactoryB(){
        return new LenovoFactoryB();
    }
}
