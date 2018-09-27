package factory.pojo;

import factory.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("画出正方型");
    }
}
