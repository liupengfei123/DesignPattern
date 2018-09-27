package model;

public class HummerModelH2 extends HummerModel {


    @Override
    protected void start() {
        System.out.println("悍马 H2  发动");
    }

    @Override
    protected void stop() {
        System.out.println("悍马 H2  停车");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马 H2  鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马 H2  引擎发动声");
    }



}
