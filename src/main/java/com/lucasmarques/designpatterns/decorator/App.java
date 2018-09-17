package com.lucasmarques.designpatterns.decorator;

public class App {

    public static void main(String[] args) {

        Gun powerFullGun = new TriggerAutoGunPart(new ExtendedCylinderGunPart(new BasicGun()));
        System.out.println(powerFullGun.getFirePower());

        Gun basicGun = new BasicGun();
        System.out.println(basicGun.getFirePower());

        Gun extendedCylinderGun = new ExtendedCylinderGunPart(new BasicGun());
        System.out.println(extendedCylinderGun.getFirePower());

    }

}
