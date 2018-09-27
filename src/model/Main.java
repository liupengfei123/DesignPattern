package model;

/**
 * 模板方法模式
 * 通过将子类 固定流程 抽取成方法 防止父类中，  可以加上  final  反正恶意修改
 *
 * 行为由父类控制， 子类实现
 */
public class Main {
    public static void main(String[] args) {
//        HummerModel h1 = new HummerModelH1();
//        h1.run();
//
//        HummerModel h2 = new HummerModelH2();
//        h2.run();


        HummerModel h1 = new HummerModelH1();
        h1.run();


        HummerModel h2 = new HummerModelH2();
        h2.setAlarmFlag(false);
        h2.run();
    }
}
