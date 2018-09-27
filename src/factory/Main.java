package factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShape(ShapeFactory.CIRCLE);
        shape1.draw();

        Shape shape2 = factory.getShape(ShapeFactory.RECTANGLE);
        shape2.draw();

        Shape shape3 = factory.getShape(ShapeFactory.CIRCLE);
        shape3.draw();




    }
}
