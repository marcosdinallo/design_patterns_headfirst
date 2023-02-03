package com.dinallo.designpatterns.strategy.duck;

public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public String display() {
        return "I'm a super Duck";
    }
}
