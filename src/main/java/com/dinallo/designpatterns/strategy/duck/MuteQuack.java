package com.dinallo.designpatterns.strategy.duck;

public class MuteQuack implements QuackBehavior{

    @Override
    public String quack() {
        return "<< Silence >>";
    }
}
