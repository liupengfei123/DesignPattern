package factory.factory;

import factory.Shape;
import factory.ShapeFactory;
import factory.pojo.Square;

/**
 * 圆形工厂
 *
 * @author liupf
 * @date 2020-05-31 21:21
 */
public class SquareFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }
}
