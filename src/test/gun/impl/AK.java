package test.gun.impl;

import test.gun.RealyGun;

public class AK extends RealyGun {

    public AK(){
        this.setName("AK");
    }

    @Override
    public void shootingShots() {
        System.out.println("用 ak 发射了 子弹");
    }
}
