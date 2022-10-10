package com.dinallo.designpatterns.into.duck;

public class FlyNoWay implements FlyBehavior{

    @Override
    public String fly() {
        return "I can't fly!";
    }
}
