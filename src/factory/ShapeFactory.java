package factory;

import factory.pojo.Circle;
import factory.pojo.Rectangle;
import factory.pojo.Square;

public class ShapeFactory {
    public static final String CIRCLE = "circle";
    public static final String SQUARE = "square";
    public static final String RECTANGLE = "rectangle";

    public Shape getShape(String shapeType){
        if(null == shapeType){
            return null;
        }

        if (CIRCLE.equals(shapeType.toLowerCase())){
            return new Circle();
        } else if (SQUARE.equals(shapeType.toLowerCase())){
            return new Square();
        } else if(RECTANGLE.equals(shapeType.toLowerCase())){
            return  new Rectangle();
        }
        return null;
    }
}
