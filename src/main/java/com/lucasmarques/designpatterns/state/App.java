package com.lucasmarques.designpatterns.state;

import com.lucasmarques.designpatterns.strategy.CreditCardStrategy;
import com.lucasmarques.designpatterns.strategy.Item;
import com.lucasmarques.designpatterns.strategy.PaypalStrategy;
import com.lucasmarques.designpatterns.strategy.ShoppingCart;

public class App {

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore();
        semaphore.observe();

        semaphore.timePasses();
        semaphore.observe();

        semaphore.timePasses();
        semaphore.observe();

        semaphore.timePasses();
        semaphore.observe();

        semaphore.timePasses();
        semaphore.observe();

        semaphore.timePasses();
        semaphore.observe();

        semaphore.timePasses();
        semaphore.observe();

    }

}
