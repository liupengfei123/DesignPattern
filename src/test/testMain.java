package test;

import test.gun.RealyGun;
import test.gun.impl.AK;
import test.gun.impl.M16;
import test.people.Soldier;

public class testMain {

    public static void main(String[] args) {
        Soldier soldier = new Soldier();


        RealyGun gun1 = new AK();
        soldier.setGun(gun1);
        soldier.shoot();

        RealyGun gun2 = new M16();
        soldier.setGun(gun2);
        soldier.shoot();

        //RealyGun gun3 = new PlayGun1();


    }

}
