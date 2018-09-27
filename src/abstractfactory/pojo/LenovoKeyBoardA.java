package abstractfactory.pojo;

import abstractfactory.KeyBoard;

public class LenovoKeyBoardA implements KeyBoard {

    @Override
    public void useKeyBoard() {
        System.out.println("使用 联想  的 A  键盘");
    }
}
