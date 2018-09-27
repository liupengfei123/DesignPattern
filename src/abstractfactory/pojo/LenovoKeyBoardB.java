package abstractfactory.pojo;

import abstractfactory.KeyBoard;

public class LenovoKeyBoardB implements KeyBoard {

    @Override
    public void useKeyBoard() {
        System.out.println("使用 联想  的 B  键盘");
    }
}
