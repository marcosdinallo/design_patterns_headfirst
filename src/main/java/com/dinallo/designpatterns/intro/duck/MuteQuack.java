package com.dinallo.designpatterns.intro.duck;

public class MuteQuack implements QuackBehavior{

    @Override
    public String quack() {
        return "<< Silence >>";
    }
}
