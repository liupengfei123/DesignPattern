package abstractfactory.pojo;

import abstractfactory.Mouse;

public class LenovoMouseA implements Mouse {

    @Override
    public void useMouse() {
        System.out.println("使用 联想  的 A  鼠标");
    }
}
