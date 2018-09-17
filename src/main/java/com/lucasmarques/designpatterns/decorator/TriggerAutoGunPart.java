package com.lucasmarques.designpatterns.decorator;

import java.math.BigDecimal;

public class TriggerAutoGunPart extends GunPartDecorator {

    public TriggerAutoGunPart(Gun gun) {
        super(gun);
    }

    public BigDecimal getFirePower() {
        return this.gun.getFirePower().add(new BigDecimal(5));
    }
}
