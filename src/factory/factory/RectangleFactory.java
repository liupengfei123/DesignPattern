package factory.factory;

import factory.Shape;
import factory.ShapeFactory;
import factory.pojo.Rectangle;

/**
 * 圆形工厂
 *
 * @author liupf
 * @date 2020-05-31 21:21
 */
public class RectangleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
