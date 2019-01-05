package com.halove.testdesignpattern.decorator;

public class Decorator implements Component {
    private Component component;
    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void move() {
      component.move();
    }
}
