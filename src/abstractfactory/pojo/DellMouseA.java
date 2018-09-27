package abstractfactory.pojo;

import abstractfactory.Mouse;

public class DellMouseA implements Mouse {

    @Override
    public void useMouse() {
        System.out.println("使用 戴尔  的 A  鼠标");
    }
}
