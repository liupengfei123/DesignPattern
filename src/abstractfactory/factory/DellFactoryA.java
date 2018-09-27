package abstractfactory.factory;

import abstractfactory.Factory;
import abstractfactory.KeyBoard;
import abstractfactory.Mouse;
import abstractfactory.pojo.DellKeyBoardA;
import abstractfactory.pojo.DellMouseA;

public class DellFactoryA implements Factory {
    @Override
    public KeyBoard getKeyBoard() {
        return new DellKeyBoardA();
    }

    @Override
    public Mouse getMouse() {
        return new DellMouseA();
    }
}
