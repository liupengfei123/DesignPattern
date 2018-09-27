package command.version2;

/**
 * 使用命令模式
 *
 *  将一个请求封装成一个对象，从而让你使用不同的请求把客户端参数化，对请求排队或者记录请求日志，可以提供命令的撤销和恢复功能
 *
 *  将需要执行的命令集成在对象中，集中传递给他人执行；
 *
 * 与建造者模式 相似 都是 将 执行流程（细节）进行封装，以产生 高层模块只需调用一个接口即可，无需关注底层实现，  但建造者模式 关注的是对象的创建，
 *      命令模式是对 流程的封装
 *
 *  并且 如果 命令数 很多 配合使用 建造者模式 使用
 *
 *
 */
public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        System.out.println("--------客户要求增加一项需求");

        Command command = new AddRequirementCommand();

        invoker.setCm(command);
        invoker.action();



    }

}
