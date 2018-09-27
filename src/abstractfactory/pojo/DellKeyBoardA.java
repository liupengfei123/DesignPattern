package abstractfactory.pojo;

import abstractfactory.KeyBoard;

public class DellKeyBoardA implements KeyBoard {

    @Override
    public void useKeyBoard() {
        System.out.println("使用 戴尔  的 A  键盘");
    }
}
