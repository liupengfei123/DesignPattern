package factory.pojo;

import factory.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("画出矩形");
    }
}
