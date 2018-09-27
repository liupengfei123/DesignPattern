package factory;

import factory.pojo.Circle;
import factory.pojo.Rectangle;
import factory.pojo.Square;

/**
 *  简单工厂模式
 *      直接使用静态方法。
 *      如果 增加需求 给图形默认增加上白色（这种统一的数据，于用户操作，及系统环境无关的数据），则会很容易拓展，不需要为每个创建对象 修改代码
 *
 *
 */
public class SimpleShapeFactory {

    public static Shape getCircle(){
        return new Circle();
    }

    public static Shape getSquare(){
        return new Square();
    }

    public static Shape getRectangle(){
        return new Rectangle();
    }


}
