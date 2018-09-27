package abstractfactory.factory;

import abstractfactory.Factory;
import abstractfactory.KeyBoard;
import abstractfactory.Mouse;
import abstractfactory.pojo.DellKeyBoardB;
import abstractfactory.pojo.DellMouseB;

public class DellFactoryB implements Factory {
    @Override
    public KeyBoard getKeyBoard() {
        return new DellKeyBoardB();
    }

    @Override
    public Mouse getMouse() {
        return new DellMouseB();
    }
}
