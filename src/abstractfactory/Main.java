package abstractfactory;

public class Main {

    public static void main(String[] args) {

        Factory lenovoA = TotelFactory.getLenovoFactoryA();
        KeyBoard keyBoardLA = lenovoA.getKeyBoard();
        keyBoardLA.useKeyBoard();
        Mouse mouseLA = lenovoA.getMouse();
        mouseLA.useMouse();

        Factory lenovoB = TotelFactory.getLenovoFactoryB();
        KeyBoard keyBoardLB = lenovoB.getKeyBoard();
        keyBoardLB.useKeyBoard();
        Mouse mouseLB = lenovoB.getMouse();
        mouseLB.useMouse();

        Factory dellA = TotelFactory.getDellFactoryA();
        KeyBoard keyBoardDA = dellA.getKeyBoard();
        keyBoardDA.useKeyBoard();
        Mouse mouseDA = dellA.getMouse();
        mouseDA.useMouse();

        Factory dellB = TotelFactory.getDellFactoryB();
        KeyBoard keyBoardDB = dellB.getKeyBoard();
        keyBoardDB.useKeyBoard();
        Mouse mouseDB = dellB.getMouse();
        mouseDB.useMouse();




    }

}
