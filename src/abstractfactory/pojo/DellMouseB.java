package abstractfactory.pojo;

import abstractfactory.Mouse;

public class DellMouseB implements Mouse {

    @Override
    public void useMouse() {
        System.out.println("使用 戴尔  的 B  鼠标");
    }
}
