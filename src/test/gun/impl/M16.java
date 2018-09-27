package test.gun.impl;

import test.gun.RealyGun;

public class M16 extends RealyGun {

    public M16(){
        this.setName("M16");
    }

    @Override
    public void shootingShots() {
        System.out.println("使用 M16 发射了子弹");
    }
}
