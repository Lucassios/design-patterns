package com.lucasmarques.designpatterns.state;

public class SemaphoreStopState implements State {

    public void observe() {
        System.out.println("The semaphore is on in red color and there is a sound indicating that pedestrians cannot pass.");
    }

}
