package model;

/**
 * 模板方法模式
 * 将固定流程抽出出来，而将各自不同的细节实现交给子类进行
 *
 * 行为由父类控制， 子类实现
 */
public class Main {
    public static void main(String[] args) {
        HummerModel h1 = new HummerModelH1();
        h1.run();

        HummerModel h2 = new HummerModelH2();
        h2.setAlarmFlag(false);
        h2.run();
    }
}
