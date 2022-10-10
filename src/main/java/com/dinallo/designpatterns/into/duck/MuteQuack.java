package com.dinallo.designpatterns.into.duck;

public class MuteQuack implements QuackBehavior{

    @Override
    public String quack() {
        return "<< Silence >>";
    }
}
