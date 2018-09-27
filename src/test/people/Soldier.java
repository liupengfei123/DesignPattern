package test.people;

import test.gun.RealyGun;

public class Soldier {

    private RealyGun gun;


    public void shoot(){
        gun.shootingShots();
    }


    public void setGun(RealyGun gun) {
        this.gun = gun;
    }
}
