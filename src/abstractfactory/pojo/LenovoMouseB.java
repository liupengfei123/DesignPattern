package abstractfactory.pojo;

import abstractfactory.Mouse;

public class LenovoMouseB implements Mouse {

    @Override
    public void useMouse() {
        System.out.println("使用 联想  的 B  鼠标");
    }
}
