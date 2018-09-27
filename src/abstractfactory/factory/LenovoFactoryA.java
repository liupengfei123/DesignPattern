package abstractfactory.factory;

import abstractfactory.Factory;
import abstractfactory.KeyBoard;
import abstractfactory.Mouse;
import abstractfactory.pojo.LenovoKeyBoardA;
import abstractfactory.pojo.LenovoMouseA;

public class LenovoFactoryA implements Factory {
    @Override
    public KeyBoard getKeyBoard() {
        return new LenovoKeyBoardA();
    }

    @Override
    public Mouse getMouse() {
        return new LenovoMouseA();
    }
}
