package com.lucasmarques.designpatterns.state;

public class SemaphoreWarningState implements State {

    public void observe() {
        System.out.println("The semaphore is on in yellow color and there is no sound indicating that pedestrians can pass.");
    }

}
