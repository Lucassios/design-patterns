package com.lucasmarques.designpatterns.state;

public class SemaphoreErrorState implements State {

    public void observe() {
        System.out.println("The semaphore is showing yellow color intermittently.");
    }

}
