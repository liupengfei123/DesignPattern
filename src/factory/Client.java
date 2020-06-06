package factory;

import factory.factory.CircleFactory;
import factory.factory.RectangleFactory;
import factory.factory.SquareFactory;

public class Client {
    public static void main(String[] args) {
        ShapeFactory factory = new CircleFactory();
        Shape shape1 = factory.createShape();
        shape1.draw();

        factory = new SquareFactory();
        Shape shape2 = factory.createShape();
        shape2.draw();

        factory = new RectangleFactory();
        Shape shape3 = factory.createShape();
        shape3.draw();
    }
}
