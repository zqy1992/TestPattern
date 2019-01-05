package com.halove.testdesignpattern.decorator;

public class ConcreteComponent implements Component {
    @Override
    public void move() {
        System.out.println("ConcreteComponent");
    }
}
