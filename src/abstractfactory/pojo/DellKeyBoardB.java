package abstractfactory.pojo;

import abstractfactory.KeyBoard;

public class DellKeyBoardB implements KeyBoard {

    @Override
    public void useKeyBoard() {
        System.out.println("使用 戴尔  的 B  键盘");
    }
}
