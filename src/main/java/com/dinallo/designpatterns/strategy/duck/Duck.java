package com.dinallo.designpatterns.strategy.duck;

import lombok.Setter;

@Setter
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {}

    public abstract String display();

    public String performFly() {
        return flyBehavior.fly();
    }

    public String performQuack() {
        return quackBehavior.quack();
    }

    public String swim() {
        return "All ducks float, even decoys";
    }
}
