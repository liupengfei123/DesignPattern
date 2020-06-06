package factory.pojo;

import factory.Shape;

public class Circle  implements Shape {
    @Override
    public void draw() {
        System.out.println("画出圆形");
    }
}
