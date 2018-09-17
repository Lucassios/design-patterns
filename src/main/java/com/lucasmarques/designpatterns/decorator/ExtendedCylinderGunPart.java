package com.lucasmarques.designpatterns.decorator;

import java.math.BigDecimal;

public class ExtendedCylinderGunPart extends GunPartDecorator {

    public ExtendedCylinderGunPart(Gun gun) {
        super(gun);
    }

    public BigDecimal getFirePower() {
        return this.gun.getFirePower().add(BigDecimal.TEN);
    }
}
