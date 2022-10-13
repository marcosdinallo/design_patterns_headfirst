package com.dinallo.designpatterns.intro.duck;

public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public String display() {
        return "I'm a real Mallard Duck!";
    }
}
