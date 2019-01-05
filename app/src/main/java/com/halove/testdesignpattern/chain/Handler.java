package com.halove.testdesignpattern.chain;

public abstract class Handler {
    private Handler nextHandler = null;

    public void setNextHandler(Handler handler) {
        nextHandler = handler;
    }

    public Handler getNextHandler() {
        return nextHandler;
    }

    public abstract void deal(String name,double fee);
}
