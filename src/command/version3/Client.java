package command.version3;


/**
 * 使用命令模式   和 建造者模式
 *
 *
 *
 */
public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        System.out.println("--------客户要求增加一项需求");

       // Command command = CommandBuild.getDeletePageCommand();
        Command command = CommandBuild.getAddRequirementCommand();
        invoker.setCm(command);
        invoker.action();



    }

}
