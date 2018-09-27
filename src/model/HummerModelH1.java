package model;

public class HummerModelH1 extends HummerModel {
    @Override
    protected void start() {
        System.out.println("悍马 H1  发动");
    }

    @Override
    protected void stop() {
        System.out.println("悍马 H1  停车");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马 H1  鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马 H1  引擎发动声");
    }
}
