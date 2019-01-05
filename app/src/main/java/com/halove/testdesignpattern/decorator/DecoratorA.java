package com.halove.testdesignpattern.decorator;

public class DecoratorA extends Decorator {

    public DecoratorA(Component component) {
        super(component);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("DecoratorA");
    }
}
