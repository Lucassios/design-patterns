package com.lucasmarques.designpatterns.state;

public class Semaphore {

    private State state;

    public Semaphore() {
        this.state = new SemaphoreErrorState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return this.state;
    }

    public void timePasses() {
        if (state.getClass().equals(SemaphoreWarningState.class)) {
            setState(new SemaphoreStopState());
        } else if (state.getClass().equals(SemaphoreGoState.class)) {
            setState(new SemaphoreWarningState());
        } else {
            setState(new SemaphoreGoState());
        }
    }

    public void observe() {
        state.observe();
    }

}
