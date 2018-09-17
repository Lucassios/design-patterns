package com.lucasmarques.designpatterns.decorator;

import java.math.BigDecimal;

public class BasicGun implements Gun {

    public BigDecimal getFirePower() {
        return BigDecimal.ONE;
    }

}
