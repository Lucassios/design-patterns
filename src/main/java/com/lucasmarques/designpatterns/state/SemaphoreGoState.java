package com.lucasmarques.designpatterns.state;

public class SemaphoreGoState implements State {

    public void observe() {
        System.out.println("The semaphore is on in green color and there is a sound indicating that pedestrians can pass.");
    }

}
