package com.lucasmarques.designpatterns.decorator;

import java.math.BigDecimal;

public abstract class GunPartDecorator implements Gun {

    protected Gun gun;

    public GunPartDecorator(Gun gun) {
        this.gun = gun;
    }

}
