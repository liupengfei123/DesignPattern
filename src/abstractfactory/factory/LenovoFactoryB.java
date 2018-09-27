package abstractfactory.factory;

import abstractfactory.Factory;
import abstractfactory.KeyBoard;
import abstractfactory.Mouse;
import abstractfactory.pojo.LenovoKeyBoardB;
import abstractfactory.pojo.LenovoMouseB;

public class LenovoFactoryB implements Factory {
    @Override
    public KeyBoard getKeyBoard() {
        return new LenovoKeyBoardB();
    }

    @Override
    public Mouse getMouse() {
        return new LenovoMouseB();
    }
}
